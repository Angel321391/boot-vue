import axios from 'axios'//引入axios
import { Message, MessageBox } from 'element-ui'
import store from '../store'
import { getToken } from '@/utils/auth'

//创建axios实例
const service = axios.create({
    // process.env.NODE_ENV === 'development' 来判断是否开发环境
    // easy-mock服务挂了，暂时不使用了
    // baseURL: 'https://www.easy-mock.com/mock/592501a391470c0ac1fab128',
    timeout: 5000  //请求超时时间
});
//request拦截器
service.interceptors.request.use(
    config => {
        if(store.getters.token){
            config.headers['Authorization']=getToken()//让每个请求携带自定义token  请求根据实际情况自行修改
        }
        return config;
    },
    error => {
        // Do something with request error
        console.log(error);// for debug
        return Promise.reject();
    }
);
//response拦截器
service.interceptors.response.use(
    response => {
        /**
         * code为非200是抛错，可结合自己业务进行修改
         * */
        if (response.status === 200) {
            return response.data;
        } else {
            Promise.reject();
        }
    },
    error => {
        console.log(error);
        return Promise.reject();
    }
);

export default service;
