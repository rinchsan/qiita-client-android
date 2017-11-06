package com.example.masayahayashi.qiitaclient

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.masayahayashi.qiitaclient.model.Article
import com.example.masayahayashi.qiitaclient.view.ArticleView

class ArticleListAdapter(private val context: Context): BaseAdapter() {

    var articles: List<Article> = emptyList()

    override fun getCount(): Int {
        return articles.size
    }

    override fun getItem(p0: Int): Any? {
        return articles[p0]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        return ((p1 as? ArticleView) ?: ArticleView(context)).apply {
            setArticle(articles[p0])
        }
    }

}
