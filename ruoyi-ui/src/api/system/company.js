import request from '@/utils/request'

// 查询单位列表
export function listCompany(query) {
  return request({
    url: '/system/company/list',
    method: 'get',
    params: query
  })
}

// 查询单位详细信息
export function getCompany(companyId) {
  return request({
    url: '/system/company/' + companyId,
    method: 'get'
  })
}

// 新增单位
export function addCompany(data) {
  return request({
    url: '/system/company',
    method: 'post',
    data: data
  })
}

// 修改单位
export function updateCompany(data) {
  return request({
    url: '/system/company',
    method: 'put',
    data: data
  })
}

// 删除单位
export function deleteCompany(companyId) {
  return request({
    url: '/system/company/' + companyId,
    method: 'delete'
  })
}
