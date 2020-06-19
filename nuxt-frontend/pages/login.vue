<template>
  <div class="profile">
    <div class="header-content">
      <div class="header-content-logo">
        <h1>ロゴ</h1>
      </div>
    </div>
    <div class="body-content">
      <h1>ログイン</h1>
      <div class="body-content-center">
        <div class="body-content-input">
          <h2>メールアドレス</h2>
          <input
            id="mail"
            name="mail"
            type="text"
            maxlength="255"
            autocomplete="off"
            aria-autocomplete="list"
            placeholder="sample@sample.co.jp"
          >
        </div>
        <div class="body-content-input">
          <h2>パスワード</h2>
          <input
            id="password"
            name="password"
            type="password"
            maxlength="255"
            autocomplete="off"
            aria-autocomplete="list"
            placeholder=""
          >
        </div>
        <div class="body-content-button">
          <button type="submit" name="login" value="login" onclick="login()">
            ログイン
          </button>
        </div>
      </div>
    </div>
    <div class="footer" />
    <div>
      <router-link to="/">
        Home
      </router-link>
    </div>
  </div>
</template>

<script>
export default {
  data () {
    return {
      name: '',
      password: '',
      response: []
    }
  },
  methods: {
    login () {
      const payload = { name: this.name, password: this.password }
      // this.$accessor.customer.registerCustomer(payload)
    }
  }
}
</script>
