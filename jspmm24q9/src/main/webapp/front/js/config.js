
var projectName = '美食推荐管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.jsp'
},

{
	name: '我的收藏',
	url: '../storeup/list.jsp'
}
]


var indexNav = [

{
	name: '热门美食',
	url: './pages/remenmeishi/list.jsp'
}, 
{
	name: '美食教程',
	url: './pages/meishijiaocheng/list.jsp'
}, 
{
	name: '美食店铺',
	url: './pages/meishidianpu/list.jsp'
}, 

{
	name: '美食社区',
	url: './pages/forum/list.jsp'
}, 
{
	name: '美食资讯',
	url: './pages/news/list.jsp'
},
]

var adminurl =  "http://localhost:8080/jspmm24q9/index.jsp";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"美食分类","menuJump":"列表","tableName":"meishifenlei"}],"menu":"美食分类管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"热门美食","menuJump":"列表","tableName":"remenmeishi"}],"menu":"热门美食管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"美食教程","menuJump":"列表","tableName":"meishijiaocheng"}],"menu":"美食教程管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"美食店铺","menuJump":"列表","tableName":"meishidianpu"}],"menu":"美食店铺管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"美食社区","tableName":"forum"}],"menu":"美食社区"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"美食资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"热门美食列表","menuJump":"列表","tableName":"remenmeishi"}],"menu":"热门美食模块"},{"child":[{"buttons":["查看"],"menu":"美食教程列表","menuJump":"列表","tableName":"meishijiaocheng"}],"menu":"美食教程模块"},{"child":[{"buttons":["查看"],"menu":"美食店铺列表","menuJump":"列表","tableName":"meishidianpu"}],"menu":"美食店铺模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"美食教程","menuJump":"列表","tableName":"meishijiaocheng"}],"menu":"美食教程管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"热门美食列表","menuJump":"列表","tableName":"remenmeishi"}],"menu":"热门美食模块"},{"child":[{"buttons":["查看"],"menu":"美食教程列表","menuJump":"列表","tableName":"meishijiaocheng"}],"menu":"美食教程模块"},{"child":[{"buttons":["查看"],"menu":"美食店铺列表","menuJump":"列表","tableName":"meishidianpu"}],"menu":"美食店铺模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
