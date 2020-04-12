import Vue from 'vue' //引入Vue
import Vuex from 'vuex' //引入Vuex
import app from './modules/app' //引入app module
import user from './modules/user' //引入user module
import getters from './getters'

Vue.use(Vuex)
const store = new Vuex.Store({
    modules: {
        app,
        user //使用user.js中的action
    },
    getters
})
export default store