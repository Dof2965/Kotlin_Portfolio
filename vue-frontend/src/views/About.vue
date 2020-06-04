<template>
  <div class="about">
    <h1>This is an about page</h1>
    <button @click="callAPI">Call API</button>
    <h2></h2>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "about",
  data() {
    return {
      greeting: ""
    };
  },
  methods: {
    callAPI() {
      axios
        .get("http://localhost:8888/api/v1/customer")
        .then(resp => {
          this.greeting = resp.data;
        })
        .catch(err => {
          this.greeting = err;
        });
    }
  }
};
</script>