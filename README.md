##### SpannableString
###### SpannableString 支持不同样式的span
1. BackgroundColorSpan:为文字添加背景颜色 例如：
<pre><code>BackgroundColorSpan span1 = new BackgroundColorSpan(Color.YELLOW);</code></pre>
2. ForegroundColorSpan:为文体设置前景，就是字体颜色。例如:
<pre><code>ForegroundColorSpan span3 = new ForegroundColorSpan(Color.BLUE);</code></pre>
3. URLSpan:设置文本带超链接。例如：
<pre><code>URLSpan span2 = new URLSpan("www.baidu.com");</code></pre>
4. AbsoliteSizeSpan:设置文本字体大小。例如
<pre><code>AbsoluteSizeSpan span4 = new AbsoluteSizeSpan(36);</code></pre>
5. StyleSpan:为文本加粗或者斜体。例如：
<pre><code>StyleSpan styleSpan_B  = new StyleSpan(Typeface.BOLD);//加粗
StyleSpan span5 = new StyleSpan(Typeface.BOLD_ITALIC);//加粗和斜
StyleSpan styleSpan_I  = new StyleSpan(Typeface.ITALIC);//加斜</code></pre>
6. UnderlineSpan:为文本添加下划线。例如：
<pre><code>UnderlineSpan span6 = new UnderlineSpan();</code></pre>
7. StrikethroughSpan:为文本添加删除线。例如：
<pre><code> StrikethroughSpan span7 = new StrikethroughSpan();</code></pre>
8. ImageSpan:在文本中插入一个image。例如：
<pre><code>ImageSpan span8 = new ImageSpan(d, ImageSpan.ALIGN_BASELINE);//添加一个drawable</code></pre>
9. RelativeSizeSpan:设置文本相对大小。例如：
<pre><code>RelativeSizeSpan span9 = new RelativeSizeSpan(1.2f);</code></pre>
10. SuperscriptSpan:设置文本上标。例如：
<pre><code>SuperscriptSpan span10 = new SuperscriptSpan();</code></pre>
11. SubscriptSpan:设置文本下标。例如：
<pre><code>SubscriptSpan span11 = new SubscriptSpan();</code></pre>
12. ClickableSpan:需要自定义来实现自己的文本点击事件。例如：
<pre><code>MyClickableSpan span12 = new MyClickableSpan("点击之后添加的文本...");</code></pre>  
13. TextAppearanceSpan:通过style样式来改变文本的样式。例如：
<pre><code>TextAppearanceSpan span13_1 = new TextAppearanceSpan(this, R.style.text_red);
TextAppearanceSpan span13_2 = new TextAppearanceSpan(this, R.style.text_black);</code></pre>  
14. TypefaceSpan:为文本设置字体。例如：
<pre><code>TypefaceSpan span14 = new TypefaceSpan("monospace");//monospace  serif or sans-serif</code></pre>
15. ScaleXSpan:对文本进行x轴的缩放。例如：
<pre><code>ScaleXSpan span15 = new ScaleXSpan(2.0f);</code></pre>
16. MaskFilterSpan:对文本设置模糊。例如：
<pre><code>MaskFilterSpan span16_1 = new MaskFilterSpan(new BlurMaskFilter(4, BlurMaskFilter.Blur.NORMAL));</code></pre>
最后还有一些其他span，例如： `RasterizerSpan`:实现光栅效果; `SuggestionSpan`:类似占位符效果等  

**效果图如下**  
![效果图](ceshi.gif)


***
> 解析方法* SpannableString.setSpan(Object what, int start, int end, int flags);*

- 第一个参数what:就是你需要传入的span对象
- 第二个参数start:就是需要处理的文本字符串起始位置
- 第三个参数end:就是需要处理文本字符串的结束位置
- 第四个参数flags:

> Spanned.SPAN_EXCLUSIVE_EXCLUSIVE：新插入的内容与原来的SpannableString独立存在，不混合在一起。
> Spanned.SPAN_EXCLUSIVE_INCLUSIVE：在结尾处插入新内容时，会与原来的SpannableString混合在一起，组成一个新的SpannableString。  
> Spanned.SPAN_INCLUSIVE_EXCLUSIVE：在开始处插入新内容时，会与原来的SpannableString混合在一起，组成一个新的SpannableString。  
> Spanned.SPAN_INCLUSIVE_INCLUSIVE：在开始或结尾处处插入新内容时，会与原来的SpannableString混合在一起，组成一个新的SpannableString
