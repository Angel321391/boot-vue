import request from '@/utils/request' //引入封装好的axios请求

export function login(username,password) {//登录接口
    return request({//使用封装好的axios进行网络请求
        url:'/login',
        method:'post',
        data:{//提交的数据
            username,
            password
        }
    })
    
}