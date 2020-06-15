import { getterTree, mutationTree, actionTree } from 'nuxt-typed-vuex'
import axios from 'axios'

export const state = () => ({
  name: '',
  password: '',
  mail: '',
  result: false
})

export const getters = getterTree(state, {
  // fullName: state => state.firstName + ' ' + state.lastName,
})

export const mutations = mutationTree(state, {
  setName (state, newValue: string) {
    state.name = newValue
  },
  setPassword (state, newValue: string) {
    state.password = newValue
  },
  setmail (state, newValue: string) {
    state.mail = newValue
  },
  setResult (state, newValue: boolean) {
    state.result = newValue
  }
})

export const actions = actionTree(
  { state, getters, mutations },
  {
    // initialise({ commit }) {
    //   commit('setFirstName', 'John')
    //   commit('setLastName', 'Baker')
    // },
    registerName ({ commit }, newName: string) {
      commit('setName', newName)
    },
    registerPassword ({ commit }, newPassword: string) {
      commit('setPassword', newPassword)
    },
    registermail ({ commit }, newmail: string) {
      commit('setmail', newmail)
    },
    async loadCustomer () {
      // TODO: URL -> define const params or property file.
      await axios.post('http://localhost:8888/api/v1/customer',
        { name: 'customer01', password: 'qwerty', mail: 'hoge@huga' })
        .then(() => {
          this.commit('setResult', true)
        })
        .catch(() => {
          this.commit('setResult', false)
        })
    }
  }
)
