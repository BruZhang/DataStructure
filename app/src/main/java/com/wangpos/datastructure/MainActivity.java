package com.wangpos.datastructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.wangpos.datastructure.core.DataBean;
import com.wangpos.datastructure.java.JavaThreadActivity;
import com.wangpos.datastructure.java.JavaThreadSummary;
import com.wangpos.datastructure.java.JavaWaitNotifyActivity;
import com.wangpos.datastructure.sort.BinaryTreeActivity;
import com.wangpos.datastructure.sort.BisearchActivity;
import com.wangpos.datastructure.sort.BubbleSortActivity;
import com.wangpos.datastructure.sort.CountSortActivity;
import com.wangpos.datastructure.sort.DirectInsertSortActivity;
import com.wangpos.datastructure.sort.EasyLinkListActivity;
import com.wangpos.datastructure.sort.EasyLinkListReverseActivity;
import com.wangpos.datastructure.sort.EightSortDescriptionActivity;
import com.wangpos.datastructure.sort.HeapSortActivity;
import com.wangpos.datastructure.sort.MaxMinSelectActivity;
import com.wangpos.datastructure.sort.MergeSortActivity;
import com.wangpos.datastructure.sort.OptionSortActivity;
import com.wangpos.datastructure.sort.QuickSortActivity;
import com.wangpos.datastructure.sort.RecursionActivity;
import com.wangpos.datastructure.sort.ShellSortActivity;
import com.wangpos.datastructure.sort.SpaceComplexityActivity;
import com.wangpos.datastructure.sort.TimeComplexityActivity;

import java.util.ArrayList;
import java.util.List;

import static com.wangpos.datastructure.core.BaseActivity.setWindowStatusBarColor;

public class MainActivity extends AppCompatActivity {

    public static final int Bisearch = 1;

    public static final int EasyLinkList = 2;

    public static final int ReverseEasyLinkList = 3;

    public static final int DirectInsertSort = 4;

    public static final int TimeComplexity = 5;

    public static final int SpaceComplexity = 6;

    public static final int QuickSort = 7;

    public static final int OptionSort = 8;

    public static final int binaryTreeSort = 9;

    public static final int BubbleSort = 10;

    public static final int JavaThread = 11;

    public static final int Recursion = 12;

    public static final int HeapSort = 13;

    public static final int MerageSort = 14;

    public static final int ShellSort = 15;

    public static final int EightSortDescription = 16;

    public static final int CountSort = 17;

    public static final int JavaThreadWaitNotify = 18;

    public static final int JavaThreadJoin = 19;

    public static final int MaxMinSelect = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setWindowStatusBarColor(this,R.color.colorPrimary);
        ListView mListView = (ListView)findViewById(R.id.listView);
        final ListAdapter adapter = new ListAdapter(this);
        List<DataBean>list = new ArrayList<>();

        initData(list);

        adapter.setDataBeanList(list);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                DataBean data = adapter.getDataBeanList().get(i);
                onClickItem(data);
            }
        });

    }

    private void onClickItem(DataBean data) {
        switch (data.type){
            case TimeComplexity:
                startActivity(new Intent(this,TimeComplexityActivity.class));
                break;
            case SpaceComplexity:
                startActivity(new Intent(this,SpaceComplexityActivity.class));
                break;
            case Bisearch:
                startActivity(new Intent(this, BisearchActivity.class));
                break;
            case EasyLinkList:
                startActivity(new Intent(this, EasyLinkListActivity.class));
                break;
            case ReverseEasyLinkList:
                startActivity(new Intent(this, EasyLinkListReverseActivity.class));
                break;
            case DirectInsertSort:
                startActivity(new Intent(this, DirectInsertSortActivity.class));
                break;
            case JavaThread:
                startActivity(new Intent(this, JavaThreadActivity.class));
                break;
            case JavaThreadWaitNotify:
                startActivity(new Intent(this, JavaWaitNotifyActivity.class));
                break;
            case QuickSort:
                startActivity(new Intent(this, QuickSortActivity.class));
                break;
            case binaryTreeSort:
                startActivity(new Intent(this, BinaryTreeActivity.class));
                break;
            case Recursion:
                startActivity(new Intent(this, RecursionActivity.class));
                break;
            case BubbleSort:
                startActivity(new Intent(this, BubbleSortActivity.class));
                break;
            case OptionSort:
                startActivity(new Intent(this, OptionSortActivity.class));
                break;
            case HeapSort:
                startActivity(new Intent(this, HeapSortActivity.class));
                break;
            case MerageSort:
                startActivity(new Intent(this, MergeSortActivity.class));
                break;
            case ShellSort:
                startActivity(new Intent(this, ShellSortActivity.class));
                break;
            case EightSortDescription:
                startActivity(new Intent(this, EightSortDescriptionActivity.class));
                break;
            case CountSort:
                startActivity(new Intent(this,CountSortActivity.class));
                break;
            case JavaThreadJoin:
                startActivity(new Intent(this, JavaThreadSummary.class));
                break;
            case MaxMinSelect:
                startActivity(new Intent(this, MaxMinSelectActivity.class));
                break;
            default:
                break;
        }

    }

    private void initData(List<DataBean> list) {
        list.add(new DataBean(TimeComplexity,"时间复杂度介绍"));
        list.add(new DataBean(SpaceComplexity,"空间复杂度介绍"));
        list.add(new DataBean(Recursion,"递归与非递归区别和转换"));
        list.add(new DataBean(Bisearch,"折半查找／二分法查找"));
        list.add(new DataBean(EasyLinkList,"Java链表实现"));
        list.add(new DataBean(ReverseEasyLinkList,"反转一个链表"));
        list.add(new DataBean(DirectInsertSort,"直接插入排序"));
        list.add(new DataBean(QuickSort,"快速排序"));
        list.add(new DataBean(OptionSort,"选择排序"));
        list.add(new DataBean(binaryTreeSort,"二叉树排序"));
        list.add(new DataBean(BubbleSort,"冒泡排序"));
        list.add(new DataBean(JavaThread,"线程通信与锁详解"));
        list.add(new DataBean(JavaThreadWaitNotify,"Wait/notify/notifyAll"));
        list.add(new DataBean(JavaThreadJoin,"Join详解"));
        list.add(new DataBean(HeapSort,"堆排序"));
        list.add(new DataBean(MerageSort,"归并排序"));
        list.add(new DataBean(ShellSort,"希尔排序"));
        list.add(new DataBean(EightSortDescription,"八大排序总结"));
        list.add(new DataBean(CountSort, "计数排序"));
        list.add(new DataBean(MaxMinSelect,"快速找出最大值最小值算法"));

    }
}
