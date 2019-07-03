<template>
    <div class="register">
        <el-container>
            <el-header>
                <el-row>
                    <el-button type="danger" width="30%"
                               position="relative" @click="toMain">全部商品分类</el-button>
                </el-row>
            </el-header>
            <el-main>
                <el-form  class="form">
                    <el-row>
                        <h2>e-book注册</h2>
                    </el-row>
                    <el-row><hr/></el-row>

                    <el-form-item>
                        <el-row>
                            <el-input placeholder="用户名" v-model="userName" class="input" ></el-input>
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
                                <el-option value="用户" label="用户"></el-option>
                                <el-option value="管理员" label="管理员"></el-option>
                            </el-select>

                        </el-row>
                    </el-form-item>
                    <el-row>

                        <el-button type="success" class="button" @click="Register" round>注册</el-button>

                    </el-row>
                </el-form>
            </el-main>
            <el-footer><p>购物指南</p></el-footer>
        </el-container>
    </div>
</template>

<script>
    export default {
        name: "Register",
        data(){
            return{
                userName:"",
                password:"",
                id:""
            }
        },
        methods:{
            Register(){
                alert("您的用户名为："+this.userName)
            },
            toMain(){

                this.$router.push({ path: `/` });
            }
        }
    }
</script>

<style scoped>
    .input{
        margin:0px;
        width: 40%;
        left:30%;/**左边30%**/



    }
    .button{
        /**样式的名字 对应class=xxx**/
        width:40%;/**宽度**/

        position:relative;
        left:30%;/**左边50%**/

    }
    .el-main {
        background-color: #E9EEF3;
        color: #333;
        text-align: left;
        line-height: 100%;
    }
</style>