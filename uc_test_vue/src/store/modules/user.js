import {login} from '@/api/login' //引入登录api接口
import { getToken, setToken } from '@/utils/auth'

const user = {
    state: {
        token: getToken(),
        name: '',
        avatar: ''
    },
    mutations: {
        SET_TOKEN: (state, token) => {
            state.token = token
        },
        SET_NAME: (state, name) => {
            state.name = name
        },
        SET_AVATAR: (state, avatar) => {
            state.avatar = avatar
        }
    },
    actions: {
        //登录
        Login({commit}, userInfo) {//定义 Login 方法，在组件中使用 this.$store.dispatch("Login") 调用
            const username = userInfo.username.trim()
            return new Promise((resolve, reject) => {//封装一个Promise
                login(username, userInfo.password).then(response => {//使用login接口进行网络请求
                    const data=response.data
                    const tokenStr=data.tokenHead+data.token
                    setToken(tokenStr)
                    commit('SET_TOKEN',tokenStr)//提交一个mutation,通知状态改变
                    resolve()//将结果封装进Promise
                }).catch(error => {
                    reject(error)
                })

            })
        },
        // 前端 登出
        FedLogOut({ commit }) {
            return new Promise(resolve => {
                commit('SET_TOKEN', '')
                removeToken()
                resolve()
            })
        }
    }
}
export default user