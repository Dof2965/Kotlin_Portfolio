<template>
  <div class="container">
    <div>
      <h2 class="subtitle">
        Example project for nuxt-typed-vuex.
      </h2>
      <div class="row">
        Email: {{ email }}
      </div>
      <div class="row">
        <button @click="setEmail">
          Set email
        </button>
      </div>
      <div class="row">
        Submodule first name: {{ firstName }}
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import { Vue, Component } from 'vue-property-decorator'
import Logo from '~/components/Logo.vue'

@Component({
  components: {
    Logo
  }
})
export default class HomePage extends Vue {
  get emails () {
    return this.$accessor.email
  }

  setEmails () {
    this.$accessor.setEmail('test@email.com')
  }
  /*
    算出プロパティ ※計算機能付きのプロパティ
    データそのものに何らかの処理を与えたものをプロパティにしたい(インスタンスに持たせて参照できるようにしたい)ときに用いる
    計算結果をキャッシュする
    一度計算を行った場合、再度関数を呼び出しても依存しているデータに変更がない限りキャッシュを返す
    プロパティなので呼び出し時の()はいらない
    getterとsetterが使える
  */
  // computed: {
  //   email () {
  //     return this.$accessor.email
  //   },
  //   firstName () {
  //     return this.$accessor.submodule.firstName
  //   }
  // },
  // mounted () {
  //   setTimeout(() => {
  //     this.$accessor.submodule.setFirstName('John')
  //   }, 1000)
  // },
  /*
    計算結果をキャッシュしないので、一度計算を行った場合も関数を呼び出される度に再計算を行う
  */
  // methods: {
  //   setEmail () {
  //     this.$accessor.setEmail('test@email.com')
  //   }
  // }
}
</script>

<style>

</style>
