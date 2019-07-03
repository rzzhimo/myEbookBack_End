<template>
    <div class="hello">
        <p>这里主要显示书籍信息</p>
        <pre>{{content}}</pre>

    </div>
</template>

<script>
    export default {
        name: "bookServlet",
        data () {
            return {
                content: ''
            }
        },
        mounted(){
            this.axios.post('http://localhost:8080/book').then(body => {
                this.content = body.data
            })
        }

    }
</script>

<style scoped>

</style>