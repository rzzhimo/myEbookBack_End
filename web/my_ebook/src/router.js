import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import book1 from './components/book1.vue'
import login from "./components/login.vue"
import shopCar from "./components/shopCar.vue"
import myOrder from "./components/myOrder.vue"
import Register from "./components/Register.vue"
import Table from "./components/Table.vue"

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import(/* webpackChunkName: "about" */ './views/About.vue')
    },
    {
      path: '/book1',
      name: 'book1',
      component: book1
    },
    {
      path: '/login',
      name: 'login',
      component: login
    },
    {
      path: '/shopCar',
      name: 'shopCar',
      component: shopCar
    },
    {
      path: '/myOrder',
      name: 'myOrder',
      component: myOrder
    },
    {
      path: '/Register',
      name: 'Register',
      component: Register
    },
    {
      path: '/Table',
      name: 'Table',
      component: Table
    },
  ]
})
