package com.example.spantext;

import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.MaskFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.QuoteSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuggestionSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = (TextView) findViewById(R.id.text);

        ((Button) findViewById(R.id.url_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.background_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.font_color_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.font_size_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.bold_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.strike_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.underLine_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.image_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.relative_size_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.super_script_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.subscript_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.clickable_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.appearance_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.typeface_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.scaleX_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.mask_filter_button)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.background_button:
                SpannableString spanString1 = new SpannableString("颜色2");
                BackgroundColorSpan span1 = new BackgroundColorSpan(Color.YELLOW);
                spanString1.setSpan(span1, 0, 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                mText.append(spanString1);
                break;
            case R.id.url_button:
                SpannableString spanString2 = new SpannableString("超链接");
                URLSpan span2 = new URLSpan("https://www.baidu.com");
                spanString2.setSpan(span2, 0, 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                mText.setMovementMethod(LinkMovementMethod.getInstance());
                mText.setText(spanString2);
                break;
            case R.id.font_color_button:
                SpannableString spanString3 = new SpannableString("颜色1");
                ForegroundColorSpan span3 = new ForegroundColorSpan(Color.BLUE);
                spanString3.setSpan(span3, 0, 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                mText.append(spanString3);
                break;
            case R.id.font_size_button:
                SpannableString spanString4 = new SpannableString("36号字体");
                AbsoluteSizeSpan span4 = new AbsoluteSizeSpan(36);
                spanString4.setSpan(span4, 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                mText.append(spanString4);
                break;
            case R.id.bold_button:
                SpannableString spanString5 = new SpannableString("BIBI");
                StyleSpan span5 = new StyleSpan(Typeface.BOLD_ITALIC);
                spanString5.setSpan(span5, 0, 2, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
                mText.append(spanString5);
                break;
            case R.id.underLine_button:
                SpannableString spanString6 = new SpannableString("下划线");
                UnderlineSpan span6 = new UnderlineSpan();
                spanString6.setSpan(span6, 0, 3, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
                mText.append(spanString6);
                break;
            case R.id.strike_button:
                SpannableString spanString7 = new SpannableString("删除线");
                StrikethroughSpan span7 = new StrikethroughSpan();
                spanString7.setSpan(span7, 0, 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                mText.append(spanString7);
                break;
            case R.id.image_button:
                SpannableString spanString8 = new SpannableString("测试插入的位置");
                Drawable d = getResources().getDrawable(R.mipmap.ic_launcher);
                d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
                ImageSpan span8 = new ImageSpan(d, ImageSpan.ALIGN_BASELINE);
                spanString8.setSpan(span8, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                mText.append(spanString8);
                break;
            case R.id.relative_size_button:
                SpannableString spannableString9 = new SpannableString("设置文本字符串相对大小");
                RelativeSizeSpan span9 = new RelativeSizeSpan(1.2f);
                spannableString9.setSpan(span9, 2, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                mText.setText(spannableString9);
                break;
            case R.id.super_script_button:
                SpannableString spannableString10 = new SpannableString("设置文本上标");
                SuperscriptSpan span10 = new SuperscriptSpan();
                spannableString10.setSpan(span10, 2, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                mText.setText(spannableString10);
                break;
            case R.id.subscript_button:
                SpannableString spannableString11 = new SpannableString("设置文本下标");
                SubscriptSpan span11 = new SubscriptSpan();
                spannableString11.setSpan(span11, 2, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                mText.setText(spannableString11);
                break;
            case R.id.clickable_button:
                SpannableString spannableString12 = new SpannableString("为文本添加点击事件");
                MyClickableSpan span12 = new MyClickableSpan("点击之后添加的文本...");
                spannableString12.setSpan(span12, 5, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                //必须添加该方法才能点击文本
                mText.setMovementMethod(LinkMovementMethod.getInstance());
                mText.setText(spannableString12);
                break;
            case R.id.appearance_button:
                SpannableString spannableString13 = new SpannableString("实现不同文本风格的效果");
                TextAppearanceSpan span13_1 = new TextAppearanceSpan(this, R.style.text_red);
                TextAppearanceSpan span13_2 = new TextAppearanceSpan(this, R.style.text_black);
                spannableString13.setSpan(span13_1, 2, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                spannableString13.setSpan(span13_2, 6, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                mText.setText(spannableString13);
                break;
            case R.id.typeface_button:
                SpannableString spannableString14 = new SpannableString("改变文本的字体");
                TypefaceSpan span14 = new TypefaceSpan("monospace");//monospace  serif or sans-serif
                spannableString14.setSpan(span14, 2, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                mText.setText(spannableString14);
                break;
            case R.id.scaleX_button:
                SpannableString spannableString15 = new SpannableString("对文本进行x轴的缩放");
                ScaleXSpan span15 = new ScaleXSpan(2.0f);
                spannableString15.setSpan(span15, 2, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                mText.setText(spannableString15);
                break;
            case R.id.mask_filter_button:
                SpannableString spannableString16 = new SpannableString("对文本添加模糊效果测测试一下");
                MaskFilterSpan span16_1 = new MaskFilterSpan(new BlurMaskFilter(4, BlurMaskFilter.Blur.NORMAL));
                MaskFilterSpan span16_2 = new MaskFilterSpan(new EmbossMaskFilter(new float[]{1, 1, 1}, 0.4f, 6, 3.5f));
                spannableString16.setSpan(span16_1, 2, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                //spannableString16.setSpan(span16_2, 6, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                mText.setText(spannableString16);
                break;
            default:
        }
    }

    class MyClickableSpan extends ClickableSpan {
        private String content;

        public MyClickableSpan(String content) {
            this.content = content;
        }

        @Override
        public void updateDrawState(@NonNull TextPaint ds) {
            ds.setUnderlineText(false);
        }

        @Override
        public void onClick(@NonNull View widget) {
            mText.append(content);
        }
    }

}
