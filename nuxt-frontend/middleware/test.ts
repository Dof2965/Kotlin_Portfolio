import { Context } from '@nuxt/types'

export default ({ redirect, app: { $accessor } }: Context) => {
  // You can access the store here
  if ($accessor.email) { return redirect('/') }
}
