<template>
    <div class="sample">
        <div class="common-header">
            <ul>
                <li><a href="profile">プロフィール</a></li>
                <li><a href="sampleCode">サンプルサイト</a></li>
                <li class="right-content">
                    <a href="register">会員登録</a>
                    <a href="login">ログイン</a>
                </li>
                <!-- 多言語対応予定地 -->
                <!-- <li><select><option></option></select> </li> -->
            </ul>
        </div>
        <div class="header-content">
            <div class="header-content-logo"><h1>ロゴ</h1></div>
                <div class="header-content-search">
                    <input name="keyword" type="search" id="search_text" maxlength="255" autocomplete="off" aria-autocomplete="list" placeholder="キーワードで探す">
                    <button type="submit" name="keyword" value="検索" onclick="">検索</button>
                </div>
            </div>
        <div class="body-content">
            <h1>販売サイトサンプル</h1>
            <div><a href="../">HOME</a></div>
        </div>
        <div class="footer"></div>
    </div>
</template>