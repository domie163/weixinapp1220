(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-yonghu-add-or-update"],{"04b3":function(t,r,e){"use strict";e.r(r);var i=e("825a"),n=e.n(i);for(var o in i)"default"!==o&&function(t){e.d(r,t,(function(){return i[t]}))}(o);r["default"]=n.a},"4e88":function(t,r,e){var i=e("e4b1");"string"===typeof i&&(i=[[t.i,i,""]]),i.locals&&(t.exports=i.locals);var n=e("4f06").default;n("e3c3cd12",i,!0,{sourceMap:!1,shadowMode:!1})},"6e35":function(t,r,e){"use strict";e.r(r);var i=e("bb5f"),n=e("04b3");for(var o in n)"default"!==o&&function(t){e.d(r,t,(function(){return n[t]}))}(o);e("a023");var a,u=e("f0c5"),s=Object(u["a"])(n["default"],i["b"],i["c"],!1,null,"18501c14",null,!1,i["a"],a);r["default"]=s.exports},"825a":function(t,r,e){"use strict";var i=e("4ea4");Object.defineProperty(r,"__esModule",{value:!0}),r.default=void 0,e("ac6a"),e("28a5"),e("96cf");var n=i(e("3b8d")),o=i(e("e2b1")),a={data:function(){return{ruleForm:{yonghuming:"",mima:"",xingming:"",xingbie:"",touxiang:"",youxiang:"",shouji:""},xingbieOptions:[],xingbieIndex:0,user:{},ro:{yonghuming:!1,mima:!1,xingming:!1,xingbie:!1,touxiang:!1,youxiang:!1,shouji:!1}}},components:{wPicker:o.default},computed:{},onLoad:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(r){var e,i,n,o;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return e=uni.getStorageSync("nowTable"),t.next=3,this.$api.session(e);case 3:if(i=t.sent,this.user=i.data,this.xingbieOptions="男,女".split(","),this.ruleForm.userid=uni.getStorageSync("userid"),r.refid&&(this.ruleForm.refid=r.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!r.id){t.next=14;break}return this.ruleForm.id=r.id,t.next=12,this.$api.info("yonghu",this.ruleForm.id);case 12:i=t.sent,this.ruleForm=i.data;case 14:if(!r.cross){t.next=49;break}n=uni.getStorageSync("crossObj"),t.t0=regeneratorRuntime.keys(n);case 17:if((t.t1=t.t0()).done){t.next=49;break}if(o=t.t1.value,"yonghuming"!=o){t.next=23;break}return this.ruleForm.yonghuming=n[o],this.ro.yonghuming=!0,t.abrupt("continue",17);case 23:if("mima"!=o){t.next=27;break}return this.ruleForm.mima=n[o],this.ro.mima=!0,t.abrupt("continue",17);case 27:if("xingming"!=o){t.next=31;break}return this.ruleForm.xingming=n[o],this.ro.xingming=!0,t.abrupt("continue",17);case 31:if("xingbie"!=o){t.next=35;break}return this.ruleForm.xingbie=n[o],this.ro.xingbie=!0,t.abrupt("continue",17);case 35:if("touxiang"!=o){t.next=39;break}return this.ruleForm.touxiang=n[o],this.ro.touxiang=!0,t.abrupt("continue",17);case 39:if("youxiang"!=o){t.next=43;break}return this.ruleForm.youxiang=n[o],this.ro.youxiang=!0,t.abrupt("continue",17);case 43:if("shouji"!=o){t.next=47;break}return this.ruleForm.shouji=n[o],this.ro.shouji=!0,t.abrupt("continue",17);case 47:t.next=17;break;case 49:this.styleChange();case 50:case"end":return t.stop()}}),t,this)})));function r(r){return t.apply(this,arguments)}return r}(),methods:{styleChange:function(){this.$nextTick((function(){}))},xingbieChange:function(t){this.xingbieIndex=t.target.value,this.ruleForm.xingbie=this.xingbieOptions[this.xingbieIndex]},touxiangTap:function(){var t=this;this.$api.upload((function(r){t.ruleForm.touxiang=t.$base.url+"upload/"+r.file,t.$forceUpdate(),t.$nextTick((function(){t.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(this.ruleForm.yonghuming){t.next=3;break}return this.$utils.msg("用户名不能为空"),t.abrupt("return");case 3:if(this.ruleForm.mima){t.next=6;break}return this.$utils.msg("密码不能为空"),t.abrupt("return");case 6:if(!this.ruleForm.youxiang||this.$validate.isEmail(this.ruleForm.youxiang)){t.next=9;break}return this.$utils.msg("邮箱应输入邮件格式"),t.abrupt("return");case 9:if(!this.ruleForm.shouji||this.$validate.isMobile(this.ruleForm.shouji)){t.next=12;break}return this.$utils.msg("手机应输入手机格式"),t.abrupt("return");case 12:if(!this.ruleForm.id){t.next=17;break}return t.next=15,this.$api.update("yonghu",this.ruleForm);case 15:t.next=19;break;case 17:return t.next=19,this.$api.add("yonghu",this.ruleForm);case 19:this.$utils.msgBack("提交成功");case 20:case"end":return t.stop()}}),t,this)})));function r(){return t.apply(this,arguments)}return r}(),optionsChange:function(t){this.index=t.target.value},bindDateChange:function(t){this.date=t.target.value},getDate:function(t){var r=new Date,e=r.getFullYear(),i=r.getMonth()+1,n=r.getDate();return"start"===t?e-=60:"end"===t&&(e+=2),i=i>9?i:"0"+i,n=n>9?n:"0"+n,"".concat(e,"-").concat(i,"-").concat(n)},toggleTab:function(t){this.$refs[t].show()}}};r.default=a},a023:function(t,r,e){"use strict";var i=e("4e88"),n=e.n(i);n.a},bb5f:function(t,r,e){"use strict";var i,n=function(){var t=this,r=t.$createElement,e=t._self._c||r;return e("v-uni-view",{staticClass:"content"},[e("v-uni-form",{staticClass:"app-update-pv"},[e("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 2rpx rgba(0,0,0,.8)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0",borderWidth:"0",borderStyle:"solid",height:"88rpx"}},[e("v-uni-view",{staticClass:"title",style:{width:"22%",fontSize:"24rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[t._v("用户名")]),e("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(205, 205, 205, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:t.ro.yonghuming,placeholder:"用户名"},model:{value:t.ruleForm.yonghuming,callback:function(r){t.$set(t.ruleForm,"yonghuming",r)},expression:"ruleForm.yonghuming"}})],1),e("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 2rpx rgba(0,0,0,.8)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0",borderWidth:"0",borderStyle:"solid",height:"88rpx"}},[e("v-uni-view",{staticClass:"title",style:{width:"22%",fontSize:"24rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[t._v("密码")]),e("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(205, 205, 205, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:t.ro.mima,placeholder:"密码"},model:{value:t.ruleForm.mima,callback:function(r){t.$set(t.ruleForm,"mima",r)},expression:"ruleForm.mima"}})],1),e("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 2rpx rgba(0,0,0,.8)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0",borderWidth:"0",borderStyle:"solid",height:"88rpx"}},[e("v-uni-view",{staticClass:"title",style:{width:"22%",fontSize:"24rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[t._v("姓名")]),e("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(205, 205, 205, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:t.ro.xingming,placeholder:"姓名"},model:{value:t.ruleForm.xingming,callback:function(r){t.$set(t.ruleForm,"xingming",r)},expression:"ruleForm.xingming"}})],1),e("v-uni-view",{staticClass:"cu-form-group select",style:{boxShadow:"0 0 2rpx rgba(0,0,0,.8)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[e("v-uni-view",{staticClass:"title",style:{width:"22%",fontSize:"24rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[t._v("性别")]),e("v-uni-picker",{attrs:{value:t.xingbieIndex,range:t.xingbieOptions},on:{change:function(r){arguments[0]=r=t.$handleEvent(r),t.xingbieChange.apply(void 0,arguments)}}},[e("v-uni-view",{staticClass:"uni-input",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"}},[t._v(t._s(t.ruleForm.xingbie?t.ruleForm.xingbie:"请选择性别"))])],1)],1),e("v-uni-view",{staticClass:"cu-form-group",class:"left"==t.left?"":"active",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"},on:{click:function(r){arguments[0]=r=t.$handleEvent(r),t.touxiangTap.apply(void 0,arguments)}}},[e("v-uni-view",{staticClass:"title",style:{width:"22%",fontSize:"24rpx",color:"rgba(1, 1, 1, 1)",textAlign:"left"}},[t._v("头像")]),e("v-uni-view",{staticClass:"right-input",staticStyle:{padding:"0"},style:{textAlign:"left"}},[t.ruleForm.touxiang?e("v-uni-image",{staticClass:"avator",style:{width:"100rpx",boxShadow:"0 0 16rpx rgba(0,0,0,.3)",borderRadius:"2%",textAlign:"left",height:"100rpx"},attrs:{src:t.ruleForm.touxiang,mode:"aspectFill"}}):e("v-uni-image",{staticClass:"avator",style:{width:"100rpx",boxShadow:"0 0 16rpx rgba(0,0,0,.3)",borderRadius:"2%",textAlign:"left",height:"100rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1)],1),e("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 2rpx rgba(0,0,0,.8)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0",borderWidth:"0",borderStyle:"solid",height:"88rpx"}},[e("v-uni-view",{staticClass:"title",style:{width:"22%",fontSize:"24rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[t._v("邮箱")]),e("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(205, 205, 205, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:t.ro.youxiang,placeholder:"邮箱"},model:{value:t.ruleForm.youxiang,callback:function(r){t.$set(t.ruleForm,"youxiang",r)},expression:"ruleForm.youxiang"}})],1),e("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 2rpx rgba(0,0,0,.8)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0",borderWidth:"0",borderStyle:"solid",height:"88rpx"}},[e("v-uni-view",{staticClass:"title",style:{width:"22%",fontSize:"24rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[t._v("手机")]),e("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(205, 205, 205, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:t.ro.shouji,placeholder:"手机"},model:{value:t.ruleForm.shouji,callback:function(r){t.$set(t.ruleForm,"shouji",r)},expression:"ruleForm.shouji"}})],1),e("v-uni-view",{staticClass:"btn"},[e("v-uni-button",{staticClass:"bg-red",style:{boxShadow:"0 0 0px rgba(0,0,0,0) inset",backgroundColor:"rgba(242, 199, 68, 1)",borderColor:"rgba(57, 78, 99, 1)",borderRadius:"40rpx",color:"rgba(0, 0, 0, 1)",borderWidth:"0",width:"40%",fontSize:"28rpx",borderStyle:"solid",height:"76rpx"},on:{click:function(r){arguments[0]=r=t.$handleEvent(r),t.onSubmitTap.apply(void 0,arguments)}}},[t._v("提交")])],1)],1)],1)},o=[];e.d(r,"b",(function(){return n})),e.d(r,"c",(function(){return o})),e.d(r,"a",(function(){return i}))},e4b1:function(t,r,e){var i=e("24fb");r=i(!1),r.push([t.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.container[data-v-18501c14]{padding:%?20?%}.content[data-v-18501c14]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-attachment:fixed;background-size:cover;background-position:50%}uni-textarea[data-v-18501c14]{border:%?1?% solid #eee;border-radius:%?20?%;padding:%?20?%}.title[data-v-18501c14]{width:%?180?%}.avator[data-v-18501c14]{width:%?150?%;height:%?60?%}.right-input[data-v-18501c14]{-webkit-box-flex:1;-webkit-flex:1;flex:1;text-align:left;padding:0 %?24?%}.cu-form-group.active[data-v-18501c14]{-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between}.btn[data-v-18501c14]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;padding:%?20?% 0}.cu-form-group[data-v-18501c14]{padding:0 %?24?%;background-color:initial;min-height:inherit}.cu-form-group + .cu-form-group[data-v-18501c14]{border:0}.cu-form-group uni-input[data-v-18501c14]{padding:0 %?30?%}.uni-input[data-v-18501c14]{padding:0 %?30?%}.cu-form-group uni-textarea[data-v-18501c14]{padding:%?30?%;margin:0}.cu-form-group uni-picker[data-v-18501c14]::after{line-height:%?88?%}.select .uni-input[data-v-18501c14]{line-height:%?88?%}.input .right-input[data-v-18501c14]{line-height:%?60?%}',""]),t.exports=r}}]);