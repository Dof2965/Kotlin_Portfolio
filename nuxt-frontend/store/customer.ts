import { getterTree, mutationTree, actionTree } from 'nuxt-typed-vuex'
import axios from 'axios'

export const state = () => ({
  name: '',
  password: '',
  mail: '',
  result: false,
  response: []
})

export const getters = getterTree(state, {
  response: state => state.response
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
  },
  setResponse (state, { response }) {
    state.response = response
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
    registerResult ({ commit }, res: boolean) {
      commit('setResult', res)
    },
    async loadCustomer ({ commit }) {
      await axios.get('http://localhost:8080/api/v1/customer')
        .then((resp) => {
          console.log(resp)
          commit('setResponse', { response: resp.data })
        })
        .catch((err) => {
          console.log(err)
        })
    },
    async registerCustomer ({ commit }, payload) {
      // TODO: URL -> define const params or property file.
      await axios.post('http://localhost:8080/api/v1/customer',
        payload)
        // { name: this.state.name, password: this.state.password, mail: this.state.mail })
        .then((resp) => {
          console.log(resp)
          commit('setResponse', { response: resp.data })
        })
        .catch((err) => {
          console.log(err)
        })
    }
  }
)
