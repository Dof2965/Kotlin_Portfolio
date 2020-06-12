<template>
    <div class="profile">

    <div class="header-content">
        <div class="header-content-logo"><h1>ロゴ</h1></div>
    </div>
    <div class="body-content">
        <h1>ログイン</h1>
        <div class="body-content-center">
            <div class="body-content-input">
                <h2>メールアドレス</h2>
                <input name="mail" type="text" id="mail" maxlength="255" autocomplete="off" aria-autocomplete="list" placeholder="sample@sample.co.jp">
            </div>
            <div class="body-content-input">
                <h2>パスワード</h2>
                <input name="password" type="password" id="password" maxlength="255" autocomplete="off" aria-autocomplete="list" placeholder="">
            </div>
            <div class="body-content-button">
                <button type="submit" name="login" value="login" onclick="">ログイン</button>
            </div>
        </div>
    </div>
    <div class="footer"></div>
    <div><router-link to="/">Home</router-link></div>
    </div>
</template>
    