<template>
  <div class="app-container">
    <!-- 搜索表单 -->
    <el-form :model="queryParams" ref="queryForm" :inline="true">
      <el-form-item label="单位名称" prop="chrName">
        <el-input
          v-model="queryParams.chrName"
          placeholder="请输入单位名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <!-- 操作按钮 -->
    <div class="operation">
      <el-button type="primary" icon="el-icon-plus" @click="handleAdd">新增</el-button>
      <el-button type="success" icon="el-icon-edit" @click="handleUpdate">修改</el-button>
      <el-button type="danger" icon="el-icon-delete" @click="handleDelete">删除</el-button>
      <el-button type="warning" icon="el-icon-download" @click="handleExport">导出</el-button>
    </div>

    <!-- 数据表格 -->
    <el-table v-loading="loading" :data="companyList" border stripe>
      <el-table-column label="单位ID" align="center" prop="chrId" width="100" />
      <el-table-column label="单位名称" align="center" prop="chrName" />
      <el-table-column label="区划编码" align="center" prop="mofDivCode" />
      <el-table-column label="区划名称" align="center" prop="mofDivName" />
      <el-table-column label="状态" align="center" prop="status" width="100">
        <template slot-scope="scope">
          <el-tag v-if="scope.row.status === '0'" type="success">正常</el-tag>
          <el-tag v-else type="danger">停用</el-tag>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" width="200">
        <template slot-scope="scope">
          <el-button size="mini" type="primary" @click="handleUpdate(scope.row)">编辑</el-button>
          <el-button size="mini" type="danger" @click="handleDelete(scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <!-- 分页 -->
    <el-pagination
      @size-change="handleSizeChange"
      @current-change="handleCurrentChange"
      :current-page="queryParams.pageNum"
      :page-sizes="[10, 20, 50, 100]"
      :page-size="queryParams.pageSize"
      layout="total, sizes, prev, pager, next, jumper"
      :total="total"
    />
  </div>
</template>

<script>
import {
  listCompany,
  getCompany,
  addCompany,
  updateCompany,
  deleteCompany,
  exportCompany,
} from "@/api/system/company";

export default {
  name: "Company",
  data() {
    return {
      companyList: [], // 单位数据列表
      total: 0, // 总记录数
      loading: false, // 加载状态
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        chrName: null,
      },
      form: {}, // 表单数据
      dialogVisible: false, // 弹窗可见性
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询单位列表 */
    getList() {
      // 设置加载状态
      this.loading = true;

      // 调用 listCompany 接口，传递查询参数
      listCompany(this.queryParams)
        .then((response) => {
          // 打印接口返回的完整内容，便于调试
          console.log("Response data:", response);

          // 将返回的数据赋值给组件变量
          this.companyList = response.rows || []; // 如果 rows 为 undefined，赋值为空数组
          this.total = response.total || 0; // 如果 total 为 undefined，赋值为 0
        })
        .catch((error) => {
          // 如果接口调用失败，打印错误信息
          console.error("Error fetching company list:", error);
          this.$message.error("加载数据失败，请稍后再试");
        })
        .finally(() => {
          // 无论成功或失败，最终关闭加载状态
          this.loading = false;
        });
    },
    /** 搜索 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置搜索 */
    resetQuery() {
      this.queryParams = {
        pageNum: 1,
        pageSize: 10,
        chrName: null,
      };
      this.getList();
    },
    /** 新增单位 */
    handleAdd() {
      this.$router.push("/system/chr/add");
    },
    /** 修改单位 */
    handleUpdate(row) {
      this.$router.push(`/system/chr/edit/${row.chrId}`);
    },
    /** 删除单位 */
    handleDelete(row) {
      this.$confirm("确认删除该单位吗？", "警告", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      }).then(() => {
        deleteCompany(row.chrId).then(() => {
          this.$message.success("删除成功");
          this.getList();
        });
      });
    },
    /** 导出单位信息 */
    handleExport() {
      exportCompany(this.queryParams).then((response) => {
        this.download(response.msg);
      });
    },
    /** 分页 */
    handleSizeChange(val) {
      this.queryParams.pageSize = val;
      this.getList();
    },
    handleCurrentChange(val) {
      this.queryParams.pageNum = val;
      this.getList();
    },
  },
};
</script>

<style scoped>
.operation {
  margin-bottom: 20px;
}
</style>
