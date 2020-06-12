<template>
    <div class="register">
<div class="common-header">
            <ul>
                <li><a href="profile">プロフィール</a></li>
                <li><a href="sampleCode">サンプルサイト</a></li>
                <li class="right-content">
                    <a href="/login">ログイン</a>
                </li>
                <!-- 多言語対応予定地 -->
                <!-- <li><select><option></option></select> </li> -->
            </ul>
</div>
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
            <input name="text" type="text" id="name" maxlength="255" autocomplete="off" aria-autocomplete="list" placeholder="">
        </div>
        <div class="body-content-input">
            <h2>メールアドレス: </h2>
            <input name="mail" type="text" id="mail" maxlength="256" autocomplete="off" aria-autocomplete="list" placeholder="sample@sample.co.jp" value="sample@sample.co.jp" disabled="disabled">
            <div>※メールアドレスは個人情報保護に関しての対応が必要になるため固定文字列とします。</div>
        </div>
        <div class="body-content-input">
            <h2>パスワード: </h2>
            <input name="password" type="password" id="password" maxlength="255" autocomplete="off" aria-autocomplete="list" placeholder="">
        </div>
        <div class="body-content-button">
            <button type="submit" name="register" value="登録" onclick="">登録</button>
        </div>
    </div>
</div>
<div class="footer"></div>
<div><a href="../">HOME</a></div>
    </div>
</template>