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
          <button type="submit" name="login" value="login" onclick="">
            ログイン
          </button>
        </div>
      </div>
    </div>
    <div class="footer">
      {{ getCustomers }}
    </div>
    <div>
      <router-link to="/">
        Home
      </router-link>
    </div>
  </div>
</template>

<script lang="ts">
export default {
  /*
    算出プロパティ ※計算機能付きのプロパティ
    データそのものに何らかの処理を与えたものをプロパティにしたい(インスタンスに持たせて参照できるようにしたい)ときに用いる
    計算結果をキャッシュする
    一度計算を行った場合、再度関数を呼び出しても依存しているデータに変更がない限りキャッシュを返す
    プロパティなので呼び出し時の()はいらない
    getterとsetterが使える
  */
  computed: {
  },
  mounted () {
  },
  /*
    計算結果をキャッシュしないので、一度計算を行った場合も関数を呼び出される度に再計算を行う
  */
  methods: {
  }
}
</script>
