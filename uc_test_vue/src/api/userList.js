import request from '@/utils/request' //引入封装好的axios请求

export function login(username,password) {//登录接口
    return request({//使用封装好的axios进行网络请求
        url:'/query',
        method:'post',
        data:{//提交的数据
            id,
            name,
            sex,
            age,
            address,
            joinDate,
            status,
            createData
        }
    })
    
}