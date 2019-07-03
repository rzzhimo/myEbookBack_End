<template xmlns:el-col="http://www.w3.org/1999/html">
    <div class="login">
        <el-container>
            <el-header>
                <el-row>
                    <el-button type="danger" width="30%"
                               position="relative"
                   @click="toMain">全部商品分类</el-button>
                </el-row>
            </el-header>
            <el-main>
        <el-row id="top">

        </el-row>
        <el-row id="login">

            <el-col :span="10" offset="2">
                <a><img src="../assets/dushu.jpeg" class="img-thumbnail " style="border-radius: 10%;" id="img"/> </a>
            </el-col>

            <el-col :span="10">
                <el-form>
                <el-row>
                    <h2>e-book登录</h2>
                </el-row>
                    <el-row><hr/></el-row>

                    <el-form-item>
                <el-row>
                    <el-input placeholder="账号" v-model="account" class="input"></el-input>
                </el-row>
                    </el-form-item>
                    <el-form-item>
                <el-row>
                    <el-input placeholder="密码" v-model="password" show-password class="input"></el-input>
                </el-row>
                    </el-form-item>
                    <el-form-item>
                <el-row>
                    <el-select placeholder="身份" v-model="id" class="input">
                        <el-option value="user" label="用户"></el-option>
                        <el-option value="manager" label="管理员"></el-option>
                    </el-select>

                </el-row>
                    </el-form-item>
                <el-row >
                    <el-col>
                        <el-button type="primary" class="button" @click="toRegister" round>登录</el-button>
                    </el-col>
                    <el-col>
                        <el-button type="success" class="button" @click="toRegister" round>注册</el-button>
                    </el-col>
                </el-row>

                    <br/>

                </el-form>
            </el-col>
        </el-row>
            </el-main>
            <el-footer><p>购物指南</p></el-footer>
        </el-container>
    </div>
</template>

<script>
    export default {
        name: "login",
        data(){
            return{
                account:"",
                password:"",
                id:""
            }

        },
        methods:{
            toMain(){
                this.$router.push({ path: `/` });
            },
            toRegister(){
                if(this.id == "manager"){
                    this.$router.push({ path: `/Table` });
                }
                else {
                    this.$router.push({ path: `/Register` });
                }

                //alert(this.id);
            }
        }
    }
</script>

<style scoped>
    @import "../mycss/login.css";
</style>