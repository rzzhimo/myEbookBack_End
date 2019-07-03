<template>
    <div class="shopCar">
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

                <el-card class="box-card">
                    <div slot="header" class="clearfix">
                        <el-col :span="4"><span>购物车商品</span></el-col>
                        <el-col :span="4"><span>作者</span></el-col>
                        <el-col :span="4"><span>语言</span></el-col>
                        <el-col :span="4"><span>售价</span></el-col>
                        <el-button style=" padding: 3px 0" type="text">操作按钮</el-button>
                    </div>
                    <div v-for="o in 8" :key="o" class="text item">

                        <el-col :span="4">{{ tableData[o].bookName+" " }}</el-col>
                        <el-col :span="4">{{ tableData[o].author+" " }}</el-col>
                        <el-col :span="4">{{ tableData[o].language+" " }}</el-col>
                        <el-col :span="4">{{ tableData[o].sales*tableData[o].num+" " }}</el-col>
                        <el-input-number v-model="tableData[o].num" @change="handleChange" :min="1" :max="10" label="数量"></el-input-number>
                        <el-button-group>
                        <el-button type="danger"
                                   position="relative" icon="el-icon-delete"></el-button>
                        <el-button type="primary"
                                   position="relative" >立即购买</el-button>
                        </el-button-group>
                        <br/>
                    </div>
                </el-card>
            </el-main>
            <el-footer>购物指南</el-footer>
        </el-container>

    </div>
</template>

<script>
    export default {
        name: "shopCar",
        data () {
            return {
                search: '',
                tableData: [{
                    bookName: '时间简史',
                    author: '史蒂芬·霍金',
                    language: 'Chinese',
                    num: 1,
                    sales: 38.00

                }, {
                    bookName: '百年孤独',
                    author: '加西亚·马尔克斯',
                    language: 'Chinese',
                    num:1,
                    sales: 44.00

                }, {
                    bookName: '人类简史',
                    author: '尤瓦尔·赫拉利',
                    language: 'Chinese',
                    num: 1,
                    sales: 66.00

                }, {
                    bookName: '未来简史',
                    author: ' 尤瓦尔·赫拉利',
                    language: 'Chinese',
                    num: 1,
                    sales: 88.00

                }, {
                    bookName: '浮生六记',
                    author: '沈复',
                    language: 'Chinese',
                    num: 1,
                    sales: 21.00
                }, {
                    bookName: '红拂夜奔',
                    author: '王小波',
                    language: 'Chinese',
                    num: 1,
                    sales: 30.00
                }, {
                    bookName: '黄金时代',
                    author: '王小波',
                    language: 'Chinese',
                    num: 1,
                    sales: 30.00
                }, {
                    bookName: '万寿寺',
                    author: '王小波',
                    language: 'Chinese',
                    num: 1,
                    sales: 20.00
                }, {
                    bookName: 'Java程序设计',
                    author: '埃里克罗伯茨',
                    language: 'Chinese',
                    num: 1,
                    sales: 50.00

                }, {
                    bookName: 'Java核心技术 卷II',
                    author: '霍斯特曼',
                    language: 'Chinese',
                    num: 1,
                    sales: 100.00
                }]
            }
        },
        methods:{
            toMain(){
                this.$router.push({ path: `/` });
            },
            delete(){

            },
            handleChange(value) {
                console.log(value);
            },

        }
    }

</script>

<style scoped>

</style>