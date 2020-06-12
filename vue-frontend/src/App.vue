<template>
  <div id="app">
    <!--
    <div id="nav">
      <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link> |
      <router-link to="/profile">Profile</router-link> |
      <router-link to="/sample">Sample</router-link> |
      <router-link to="/login">Login</router-link> |
      <router-link to="/register">Register</router-link>
    </div>
    -->
    <div class="common-header">
        <ul>
            <li><router-link to="/profile">プロフィール</router-link></li>
            <li><router-link to="/sample">サンプルサイト</router-link></li>
            <li class="right-content">
                <router-link to="/register">会員登録</router-link>
                <router-link to="/login">ログイン</router-link>
            </li>
            <!-- 多言語対応予定地 -->
            <!-- <li><select><option></option></select> </li> -->
        </ul>
    </div>

    <router-view/>

  </div>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}

@import "./css/base.css";

</style>