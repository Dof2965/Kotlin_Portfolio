import { getAccessorType, mutationTree, actionTree } from 'nuxt-typed-vuex'

import * as submodule from './submodule'
import * as customer from './customer'

export const state = () => ({
  email: 'state@email'
})

type RootState = ReturnType<typeof state>

export const getters = {
  email: (state: RootState) => state.email,
  fullEmail: (state: RootState) => state.email
}

export const mutations = mutationTree(state, {
  setEmail (state, newValue: string) {
    state.email = newValue
  },

  initialiseStore () {
    // eslint-disable-next-line no-console
    console.log('initialised')
  }
})

export const actions = actionTree(
  { state, getters, mutations },
  {
    // eslint-disable-next-line require-await
    async resetEmail ({ commit }) {
      commit('setEmail', 'a@a.com')
    }
  }
)

export const accessorType = getAccessorType({
  actions,
  getters,
  mutations,
  state,
  modules: {
    submodule,
    customer
  }
})
