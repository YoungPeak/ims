<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://"
          + request.getServerName() + ":" + request.getServerPort()
          + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>IMS 国际化资源管理系统</title>
  <!-- import CSS -->
  <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
  <style>
    .el-header {
      background-color: #B3C0D1;
      color: #333;
      line-height: 60px;
    }

    .el-aside {
      color: #333;
    }
  </style>
</head>
<body>
<div id="app">
  <el-container style="height: 500px; border: 1px solid #eee">
    <el-header style="font-size: 12px">
      <span style="">IMS 国际化资源管理系统</span>
      <el-dropdown style="float:right;">
        <i class="el-icon-setting" style="margin-right: 15px"></i>
        <el-dropdown-menu slot="dropdown">
          <el-dropdown-item>查看</el-dropdown-item>
          <el-dropdown-item>新增</el-dropdown-item>
          <el-dropdown-item>删除</el-dropdown-item>
        </el-dropdown-menu>
      </el-dropdown>
      <span style="float:right">王小虎</span>
    </el-header>
    <el-container>
      <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
        <el-menu :default-openeds="['1']">

          <el-submenu index="1">
            <template slot="title"><i class="el-icon-setting"></i>产品</template>
            <el-menu-item-group>

              <el-menu-item index="3-1">云会议移动端</el-menu-item>
              <el-menu-item index="3-2">云会议PC端</el-menu-item>
            </el-menu-item-group>


          </el-submenu>
        </el-menu>
      </el-aside>
      <el-main>
        <el-table :data="tableData">
          <el-table-column prop="date" label="日期" width="140">
          </el-table-column>
          <el-table-column prop="name" label="姓名" width="120">
          </el-table-column>
          <el-table-column prop="address" label="地址">
          </el-table-column>
        </el-table>
      </el-main>
    </el-container>


  </el-container>


</div>
</body>
<!-- import Vue before Element -->
<script type="text/javascript" src="js/vue.js"></script>
<!-- import JavaScript -->
<script type="text/javascript" src="js/index.js"></script>
<script>
  var Main = {
    data() {
      const item = {
        date: '2016-05-02',
        name: '王小虎',
        address: '上海市普陀区金沙江路 1518 弄'
      };
      return {
        tableData: Array(20).fill(item)
      }
    }
  };
  var Ctor = Vue.extend(Main)
  new Ctor().$mount('#app')
</script>
</html>
