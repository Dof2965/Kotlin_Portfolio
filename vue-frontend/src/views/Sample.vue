<template>
    <div class="sample">
        <div class="header-content">
            <div class="header-content-logo"><h1>ロゴ</h1></div>
                <div class="header-content-search">
                    <input name="keyword" type="search" id="search_text" maxlength="255" autocomplete="off" aria-autocomplete="list" placeholder="キーワードで探す">
                    <button type="submit" name="keyword" value="検索" onclick="">検索</button>
                </div>
            </div>
        <div class="body-content">
            <h1>販売サイトサンプル</h1>
            <div><router-link to="/">Home</router-link></div>
        </div>
        <div class="footer"></div>
    </div>
</template>