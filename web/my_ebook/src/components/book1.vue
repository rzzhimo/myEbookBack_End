<template>
    <div class="bookInfo">
        <el-container>
        <el-header>
            <el-row>
                <el-button type="danger" width="30%"
                           position="relative" @click="toMain">全部商品分类</el-button>

                <el-button type="text">特色书单</el-button>
                <el-button type="text">教育</el-button>
                <el-button type="text">小说</el-button>
                <el-button type="text">文艺</el-button>
            </el-row>

        </el-header>
        <el-main>
            <el-row>
                <el-col :span="5">
                    <a><img src="../assets/weilai.jpeg" class="img-thumbnail book1" alt=""></a>
                </el-col>
                <el-col :span="14">
                    <e-row>
                        <h1>书籍介绍</h1>
                    </e-row>
                    <el-row>
                        <el-row>作者:[以色列] 尤瓦尔·赫拉利（Yuval Noah Harari）</el-row>
                        <el-row>出版社:中信出版社出版时间:2017年01月</el-row>
                        <el-row>在当当历史畅销榜排名3位</el-row>
                    </el-row>
                    <el-row>
                        <el-button type="danger" @click="dialogVisible = true" >加入购物车</el-button>
                        <el-dialog
                                title="加入购物车"
                                :visible.sync="dialogVisible"
                                width="30%"
                                >
                            <el-row>
                                <el-col ><a><img src="../assets/weilai.jpeg" class="img-thumbnail book2"></a></el-col>
                            </el-row>
                            <el-row><el-col><h1>未来简史</h1></el-col></el-row>


                            <el-input-number v-model="num" :min="1" :max="10" label="数量"></el-input-number>
                            <span slot="footer" class="dialog-footer">

                            <el-button-group>
                                <el-button @click="dialogVisible = false">取 消</el-button>
                                <el-button type="danger" @click="dialogVisible = false">确 定</el-button>
                            </el-button-group>
                            </span>
                        </el-dialog>
                        <el-button type="primary">马上购买</el-button>
                    </el-row>

                </el-col>
                <el-col :span="5">推荐书籍</el-col>
            </el-row>
            <el-row>
                <div><h3 class="title">
                    猜您喜欢
                </h3></div>
            </el-row>
            <el-row>
                <el-col :span="12" :offset="6">
                    <a><img src="../assets/weilai.jpeg" class="img-thumbnail book2"></a>
                    <a><img src="../assets/weilai.jpeg" class="img-thumbnail book2"></a>
                    <a><img src="../assets/weilai.jpeg" class="img-thumbnail book2"></a>
                    <a><img src="../assets/weilai.jpeg" class="img-thumbnail book2"></a>
                </el-col>

            </el-row>
        </el-main>
        <el-footer>购物指南</el-footer>
        </el-container>
    </div>
</template>

<script>
    export default {
        name: "book1",
        data() {
            return {
                num:1,
                dialogVisible: false
            };
        },
        methods: {
            toMain(){
                this.$router.push({ path: `/` });
            },

        }

    }
</script>

<style scoped>
    @import "../mycss/book1.css";


</style>