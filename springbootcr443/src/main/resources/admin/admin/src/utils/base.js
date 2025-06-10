const base = {
    get() {
                return {
            url : "http://localhost:8080/springbootcr443/",
            name: "springbootcr443",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootcr443/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "“闲一品”交易平台"
        } 
    }
}
export default base
