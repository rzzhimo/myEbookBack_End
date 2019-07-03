<template>
  <div class="hello">
    <el-container>
      <el-header>
        <el-row>
          <el-col :span="8"><el-input typeof="text" v-model="inputBook" placeholder="请输入查询书籍" id="input1"></el-input></el-col>
          <el-col :span="4"><el-button type="success" icon="el-icon-search" ></el-button></el-col>
          <el-col :span="12" align="right">
            <el-button-group>
            <el-button type="primary" class="button2"   @click="shopCar">购物车</el-button>
            <el-button type="primary" class="button2"  @click="myOrder">我的订单</el-button>
            <el-button type="primary" class="button2"  @click="login">登录</el-button>
            <el-button type="primary" class="button2"  @click="Register">注册</el-button>
            </el-button-group>
          </el-col>
        </el-row>
      </el-header>
      <el-container>
        <el-aside width="15%">
          <el-row>



          </el-row>
          <el-row>
            特色书单
          </el-row>
          <el-row>
            教育
          </el-row>
          <el-row>
            小说
          </el-row>
          <el-row>
            文艺
          </el-row>
        </el-aside>
        <el-main>
          <el-row>
            <el-carousel :interval="4000" type="card" arrow="always">
              <el-carousel-item v-for="o in 6" :key="o">
                <img :src="slidePic[o].images" alt="">
              </el-carousel-item>
            </el-carousel>
          </el-row>
          <hr/>

          <el-row>
            <el-col :span="8">
              <el-row>
                <a @click="toBook1"><img src="../assets/hong.jpg" class="img-thumbnail book"></a>
              </el-row>
              <el-row>
              <el-button type="text" @click="toBook1" id="book">红拂夜奔</el-button>
              <router-view/>
              </el-row>
            </el-col>
            <el-col :span="8">
              <el-row>
                <a><img src="../assets/ren.jpg" class="img-thumbnail book" ></a>
              </el-row>
              <el-row>
              <el-button type="text" @click="toBook1">人类简史</el-button>
              <router-view/>
              </el-row>
            </el-col>

            <el-col :span="8">
              <el-row>
                <a><img src="../assets/shijian.jpg" class="img-thumbnail book"></a>
              </el-row>
              <el-row>
              <el-button type="text" @click="toBook1">图书3</el-button>
              <router-view/>
              </el-row>
            </el-col>

          </el-row>

          <el-row>
            <el-col :span="8">
              <el-row>
                <a><img src="../assets/wan.jpg" class="img-thumbnail book"></a>
              </el-row>
              <el-row>
                <el-button type="text" @click="toBook1">图书3</el-button>
                <router-view/>
              </el-row>
            </el-col>
            <el-col :span="8">
              <el-row>
                <a><img src="../assets/huang.jpg" class="img-thumbnail book"></a>
              </el-row>
              <el-row>
                <el-button type="text" @click="toBook1">图书3</el-button>
                <router-view/>
              </el-row>
            </el-col>
            <el-col :span="8">
              <el-row>
                <a><img src="../assets/weilai.jpeg" class="img-thumbnail book"></a>
              </el-row>
              <el-row>
                <el-button type="text" @click="toBook1">图书3</el-button>
                <router-view/>
              </el-row>
            </el-col>
            <p>{{book}}</P>
          </el-row>
          <el-row>
            <span class="demonstration"></span>

            <el-pagination
                    background="blue"
                    layout="prev, pager, next"
                    :total="1000">
            </el-pagination>
          </el-row>
        </el-main>
      </el-container>

      <el-footer><p>购物指南</p></el-footer>

    </el-container>
  </div>
</template>

<script>
export default {
  name: 'IndexOfBook',
  props: {
    msg: String
  },
  data(){
    return {
      slidePic:[{
        images:require("../assets/dazhe.jpg"),
         name:"hhh"
      },{
        images:require("../assets/dazhe2.jpg"),
          name:"hhh"
      },{
        images:require("../assets/dazhe3.jpg"),
          name:"hhh"
      },{
        images:require("../assets/dazhe4.jpg"),
          name:"hhh"
      },{
        images:require("../assets/dazhe5.jpg"),
          name:"hhh"
      },{
        images:require("../assets/dazhe2.jpg"),
          name:"hhh"
      },{
          images:require("../assets/dazhe4.jpg"),
          name:"hhh"
      }],
      inputBook:"",
      book:"",
    }
  },
  methods:{
    login(){
      this.$router.push({ path: `/login` });
    },
    Register(){
      this.$router.push({ path: `/Register` });
    },
    shopCar(){
      this.$router.push({ path: `/shopCar` });
    },
    myOrder(){
      this.$router.push({ path: `/myOrder` });
    },

    toBook1(){
      // if(document.getElementById("book").style.color=="red")
      // {document.getElementById("book").style.color="black";}
      // else {document.getElementById("book").style.color="red"}
      this.$myAxios.get('http://localhost:8080/explore/list')
              .then(function (response) {
                this.book=response.data;
                alert(response.data);
              })
              .catch(function (error) {
                console.log(error);  // 失败
              });

      //this.$router.push({ path: `/book1` });


    },
    toBookServlet(){

    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import "../mycss/IndexOfBook.css";

  .el-carousel__item:nth-child(2n) {
    width: 100%;
    height: 100%;
  }

</style>
