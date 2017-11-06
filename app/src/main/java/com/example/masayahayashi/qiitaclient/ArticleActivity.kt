package com.example.masayahayashi.qiitaclient

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView
import com.example.masayahayashi.qiitaclient.model.Article
import com.example.masayahayashi.qiitaclient.view.ArticleView

/**
 * Created by masayahayashi on 2017/11/06.
 */

class ArticleActivity: AppCompatActivity() {

    companion object {
        private const val ARTICLE_EXTRA: String = "article"

        fun intent(context: Context, article: Article): Intent =
                Intent(context, ArticleActivity::class.java).putExtra(ARTICLE_EXTRA, article)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

        val articleView: ArticleView = findViewById(R.id.article_view)
        val webView: WebView = findViewById(R.id.web_view)

        val article: Article = intent.getParcelableExtra(ARTICLE_EXTRA)
        articleView.setArticle(article)
        webView.loadUrl(article.url)
    }

}
