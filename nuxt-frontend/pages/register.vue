<template>
  <div class="register">
    <div class="header-content">
      <div class="header-content-logo">
        <h1>ロゴ</h1>
      </div>
    </div>
    <div class="body-content">
      <h1>新規会員登録</h1>
      <div class="body-content-center">
        <div class="body-content-input">
          <h2>Name: </h2>
          <input
            id="name"
            v-model="name"
            name="text"
            type="text"
            maxlength="255"
            autocomplete="off"
            aria-autocomplete="list"
            placeholder=""
          >
        </div>
        <div class="body-content-input">
          <h2>メールアドレス: </h2>
          <input
            id="mail"
            v-model="mail"
            name="mail"
            type="text"
            maxlength="256"
            autocomplete="off"
            aria-autocomplete="list"
            placeholder="sample@sample.co.jp"
            disabled="disabled"
          >
          <div>※メールアドレスは個人情報保護に関しての対応が必要になるため固定文字列とします。</div>
        </div>
        <div class="body-content-input">
          <h2>パスワード: </h2>
          <input
            id="password"
            v-model="password"
            name="password"
            type="password"
            maxlength="255"
            autocomplete="off"
            aria-autocomplete="list"
            placeholder=""
          >
        </div>
        <div class="body-content-button">
          <button type="submit" name="register" value="登録" @click="register">
            登録
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
      mail: 'sample@sample.co.jp'
    }
  },
  methods: {
    register () {
      this.$accessor.customer.setName(this.name)
      this.$accessor.customer.setPassword(this.password)
      this.$accessor.customer.setmail(this.mail)
      this.$accessor.customer.loadCustomer()
    }
  }
}
</script>

<style>

</style>
