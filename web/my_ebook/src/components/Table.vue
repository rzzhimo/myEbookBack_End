<template>
    <div class="Table">
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
        <el-input v-model="search" style="width: 30%"
                  placeholder="请输入书名" prefix-icon="el-icon-search"/>
        <el-table :data="tableData.filter(data=>!search || data.bookName.includes(search))"
                  stripe
                  style="width: 100%">
            <el-table-column>
                <!--<template slot="header"  scope="scope" >-->
                <!--<el-input v-model="search" style="width: 300px"-->
                <!--placeholder="请输入书名" prefix-icon="el-icon-search"/>-->
                <!--</template>-->
                <el-table-column
                        type="index"
                >
                </el-table-column>
                <el-table-column
                        prop="bookName"
                        label="书名"
                        sortable
                ></el-table-column>
                <el-table-column
                        prop="author"
                        label="作者"
                        sortable
                ></el-table-column>
                <el-table-column
                        prop="language"
                        label="语言"
                        sortable
                ></el-table-column>
                <el-table-column
                        prop="date"
                        label="出版日期"
                        sortable
                ></el-table-column>
                <el-table-column
                        prop="sales"
                        label="库存"
                        sortable
                ></el-table-column>
                <el-table-column
                        align="right">
                    <template slot-scope="scope">
                        <el-button
                                size="mini"
                                @click="handleEdit(scope.$index, scope.row)">Edit</el-button>
                        <el-button
                                size="mini"
                                type="danger"
                                @click="handleDelete(scope.$index, scope.row)">Delete</el-button>
                    </template>
                </el-table-column>
            </el-table-column>
        </el-table>
            </el-main>
            <el-footer>购物指南</el-footer>
        </el-container>
    </div>
</template>

<script>
    export default {
        name: 'Table',
        data () {
            return {
                search: '',
                tableData: [{
                    bookName: '时间简史',
                    author: '史蒂芬·霍金',
                    language: 'Chinese',
                    date: 2015,
                    sales: 3834

                }, {
                    bookName: '百年孤独',
                    author: '加西亚·马尔克斯',
                    language: 'Chinese',
                    date: 2014,
                    sales: 4434

                }, {
                    bookName: '人类简史',
                    author: '尤瓦尔·赫拉利',
                    language: 'Chinese',
                    date: 2012,
                    sales: 6634

                }, {
                    bookName: '未来简史',
                    author: ' 尤瓦尔·赫拉利',
                    language: 'Chinese',
                    date: 2015,
                    sales: 88434

                }, {
                    bookName: '浮生六记',
                    author: '沈复',
                    language: 'Chinese',
                    date: 2010,
                    sales: 21445
                }, {
                    bookName: '红拂夜奔',
                    author: '王小波',
                    language: 'Chinese',
                    date: 2010,
                    sales: 30345
                }, {
                    bookName: '黄金时代',
                    author: '王小波',
                    language: 'Chinese',
                    date: 2008,
                    sales: 30555
                }, {
                    bookName: '万寿寺',
                    author: '王小波',
                    language: 'Chinese',
                    date: 2010,
                    sales: 2055
                }, {
                    bookName: 'Java程序设计',
                    author: '埃里克罗伯茨',
                    language: 'Chinese',
                    date: 2017,
                    sales: 5044

                }, {
                    bookName: 'Java核心技术 卷II',
                    author: '霍斯特曼',
                    language: 'Chinese',
                    date: 2017,
                    sales: 10055
                }]
            }
        },
        methods: {
            handleEdit (index, row) {
                console.log(row.author, row.bookName, row.language, row.date, row.sales)
            },
            handleDelete (index, row) {
                alert(index, row)
            },
            toMain(){
                this.$router.push({ path: `/` });
            }
        }
    }
</script>

<style scoped>

</style>
