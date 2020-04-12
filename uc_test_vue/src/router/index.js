//写完页面后统一使用路由来管理显示页面

import Vue from 'vue';  //引入vue
import Router from 'vue-router';  //引入Vue路由

Vue.use(Router);  //安装插件

export default new Router({
    routes: [
        {
            path: '/',
            redirect: '/dashboard'
        },
        //配置相关页面，使用时需要使用 path 路径来实现跳转
        {
            path: '/',
            component: () => import(/* webpackChunkName: "home" */ '../components/common/Home.vue'),
            meta: { title: '自述文件' },
            children: [
                {
                    path: '/dashboard',
                    component: () => import(/* webpackChunkName: "dashboard" */ '../components/page/Dashboard.vue'),
                    meta: { title: '系统首页' }
                },
                {
                    path: '/user',
                    component: () => import(/* webpackChunkName: "icon" */ '../components/page/userList.vue'),
                    meta: { title: '员工列表' }
                },
            ]
        },
        {
            path: '/login',
            component: () => import(/* webpackChunkName: "login" */ '../components/page/Login.vue'),
            meta: { title: '登录' }
        },
    ]
});
