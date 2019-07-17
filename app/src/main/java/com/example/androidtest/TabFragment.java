package com.example.androidtest;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

@SuppressLint("ValidFragment")
public class TabFragment extends Fragment {

    private List<Follow> FollowList = new ArrayList<>();
    private List<Needs> NeedsList = new ArrayList<>();
    private List<Technology> TechnologyList = new ArrayList<>();
    private List<News> NewsList = new ArrayList<>();

    public static final int TYPE_ONE = 1;
    public static final int TYPE_TWO = 2;
    private RecyclerView mRecyclerView;
    private InterlocutionAdapter mAdapter;

    private int pos;

    private View view;

    @SuppressLint("ValidFragment")
    public TabFragment(int pos) {
        this.pos = pos;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        switch (pos) {
            case 0:
                view = inflater.inflate(R.layout.fragment_homepage_follow, container, false);
                initFollows();
                RecyclerView recyclerView1 = (RecyclerView) view.findViewById(R.id.recycler_view1);
                LinearLayoutManager layoutManager1 = new LinearLayoutManager(getActivity());

                recyclerView1.addItemDecoration(new RecyclerView.ItemDecoration() {
                    @Override
                    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                        outRect.top = 20;
                    }
                });

                recyclerView1.setLayoutManager(layoutManager1);
                FollowAdapter adapter1 = new FollowAdapter(FollowList);
                recyclerView1.setAdapter(adapter1);
                break;
            case 1:
                view = inflater.inflate(R.layout.fragment_homepage_answer, container, false);
                initUI();
                break;
            case 2:
                view = inflater.inflate(R.layout.fragment_homepage_needs, container, false);
                initNeeds();
                RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.recycler_view3);
                LinearLayoutManager layoutManager3 = new LinearLayoutManager(getActivity());

                recyclerView3.addItemDecoration(new RecyclerView.ItemDecoration() {
                    @Override
                    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                        outRect.top = 20;
                        outRect.left = 20;
                        outRect.right = 20;
                    }
                });

                recyclerView3.setLayoutManager(layoutManager3);
                NeedsAdapter adapter3 = new NeedsAdapter(NeedsList);
                recyclerView3.setAdapter(adapter3);
                break;
            case 3:
                view = inflater.inflate(R.layout.fragment_homepage_technology, container, false);
                initTechnologys();
                RecyclerView recyclerView4 = (RecyclerView) view.findViewById(R.id.recycler_view4);
                LinearLayoutManager layoutManager4 = new LinearLayoutManager(getActivity());

                recyclerView4.addItemDecoration(new RecyclerView.ItemDecoration() {
                    @Override
                    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                        outRect.top = 20;
                        outRect.left = 20;
                        outRect.right = 20;
                    }
                });

                recyclerView4.setLayoutManager(layoutManager4);
                TechnologyAdapter adapter4 = new TechnologyAdapter(TechnologyList);
                recyclerView4.setAdapter(adapter4);
                break;
            case 4:
                view = inflater.inflate(R.layout.fragment_homepage_news, container, false);
                initNews();
                RecyclerView recyclerView5 = (RecyclerView) view.findViewById(R.id.recycler_view5);
                LinearLayoutManager layoutManager5 = new LinearLayoutManager(getActivity());

                recyclerView5.addItemDecoration(new RecyclerView.ItemDecoration() {
                    @Override
                    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                        outRect.top = 20;
                    }
                });

                recyclerView5.setLayoutManager(layoutManager5);
                NewsAdapter adapter5 = new NewsAdapter(NewsList);
                recyclerView5.setAdapter(adapter5);
                break;
            default:
                break;
        }
        return view;
    }

    private void initFollows() {
        Follow follow1 = new Follow(R.drawable.huida1,"赵托尼发布了技术","1小时前",
                "一种超低成本且非常灵活的柔性机器人","实现了聊天机器人的躯干和头部" +
                "相配合，可以做出转头、耸肩、躯干扭曲等动作，这些肢体语言配合语音的开发，" +
                "将会使聊天机器人上升到一个更高的境界。","98","35");
        FollowList.add(follow1);
        Follow follow2 = new Follow(R.drawable.huida2,"中科院张博士回答了问题","2小时前",
                "5G通信技术对虚拟现实的发展","相比于4G，5G技术最显著的提升即在速度" +
                "上。传输速度上的提升将会为VR直播等VR技术赋能，增加VR技术实际落地的可能性。例如目前联通" +
                "在5G技术上的部署，这其中就着重强调了VR产品。","82","45");
        FollowList.add(follow2);
        Follow follow3 = new Follow(R.drawable.huida3,"康力仕更改了需求","2小时前",
                "智能家居、酒柜","简介：让酒柜真正实现智能化，目前国内还没有这种产品，" +
                "一旦完成，将会是国内酒柜产业的独角兽。","12","13");
        FollowList.add(follow3);
        Follow follow4 = new Follow(R.drawable.huida4,"方天琳发起了问答","3小时前",
                "semantic segmentation 的技术难点在哪里？（本质上的难点）或者可以从哪里突破？",
                "我入门语义分割快两个月的时间，从一开始的全卷积网络到目前流行的空洞卷积+空间金字塔的 形式，" +
                        "不知道如果要继续突破现有的精度或者提升速度，技术难点在哪里？或者说，语义分割的本质难点在哪里？",
                "42","33");
        FollowList.add(follow4);
        FollowList.add(follow4);
        FollowList.add(follow4);
        FollowList.add(follow4);
    }

    private void initUI() {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view2);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        mAdapter = new InterlocutionAdapter(getActivity());
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                outRect.top = 20;
            }
        });
        initData();
    }

    private void initData() {
        ArrayList<problem> list1 = new ArrayList<>();
        problem problem1 = new problem(R.drawable.follow1,"张越 *","1小时前",
                "投资人工智能教育效果怎么样?","如今随着人工智能的火热发展，各行各业均" +
                "在想方设法的引入人工智能，在教育方面更是多方面的引用人工智能，在这里我想问问各位教育的行家，" +
                "人工智能在教育方面的使用效果怎么样","42");
        problem problem2 = new problem(R.drawable.follow2,"迈科技周经理 *","2小时前",
                "如何看待华为将发布智能家居独立品牌【华为智选】","36氪讯，华为将发布智能家居独立品牌" +
                "\"华为智选\"，并计划在今年开设1000家智能家居线下体验店，其中改造800家现有门店，新增200家，" +
                "以“品牌共生、流量共享、体验一致”为原则打造IoT合作生态。","56");
        problem problem3 = new problem(R.drawable.follow3,"刘舒淇 *","3小时前",
                "如何看待未来人工智能的发展","人工智能快速发展的今天，我们发现人工智能离" +
                "我们的生活越来越近，我们该如何看待人工智能的发展，人工智能能给我们带来什么样的未来","14");
        list1.add(problem1);
        list1.add(problem2);
        list1.add(problem3);
        ArrayList<payment> list2 = new ArrayList<>();
        payment payment1 = new payment(R.drawable.follow4,"李海威 *","3小时前",
                "为什么说人机融合智能是强人工智能","12","待回答...");
        payment payment2 = new payment(R.drawable.collection,"周思源 *","4小时前",
                "中日为何\"情定\"自动驾驶？或掀起新一轮全球风云","75","待回答...");
        payment payment3 = new payment(R.drawable.collection,"匡云飞 *","6小时前",
                "从推销商品到经营用户，服务机器人如何重塑场景体验？","99","已结");
        list2.add(payment1);
        list2.add(payment2);
        list2.add(payment3);
        mAdapter.addList(list1,list2);
        mAdapter.notifyDataSetChanged();
    }

    private void initNeeds() {
        Needs needs = new Needs("皮革产品上下料机器人自动化技术","简介：公司主要从事皮革产品制造，皮革产品" +
                "上下料目前是由手工完成，目前急需开发皮革产品上下料机器人自动化设备，上下料的皮革产品长度达到2米，" +
                "宽1米左右，每小时要求上下料1000张，希望与机器人自动化相关专家一起合作开发。","经费：面议","浙江","发布时间：2019-03-18");
        Needs needs1 = new Needs("寻找无丙烷提纯技术",
                "简介：企业现在从国外买了纯度为97%的无丙烷，但是客户需要纯度99.9%","经费：10万元以下",
                "广东","发布时间：2019-03-07");
        NeedsList.add(needs);
        NeedsList.add(needs1);
        Needs needs2 = new Needs("机器人激光与光学控制系统的研发与产业化", "简介：1、光控在不同环境中受到的重复精度影响；" +
                " 2、机器人与光控技术协同算法软浮动控制程序稳定性检测；","经费：20万到50万","北京","发布时间：2019-03-01");
        Needs needs3 = new Needs("开发一套适合公司现状的MES系统", "简介：随着企业产品的升级换代以及客户对品质要求的不断提升，" +
                "企业需要对仓库管理、生产进度、设备状态以及品质状况进行实时监控和及时改善，为达成上述要求，" +
                "需要对公司管理系统进行升级改造，开发一套适合公司现状的MES系统，可以很好的解决我们的需求。","经费：面议","北京","发布时间：2019-02-19");
        Needs needs4 = new Needs("裸眼3D显示技术", "简介：裸眼3D技术在分辨率、亮度、可视角度方面存在着进步的空间，" +
                "裸眼3D产品在切换到3D模式时，分辨率会出现较大程度损失。而且如果想要观看到比较生动的3D效果，需满足合适" +
                "的角度和距离，否则轻则3D效果降低，严重的话只能看到充满了重影的影像。除了裸眼3D技术自身的不完善，从成本、时效性等方面看，" +
                "现有的3D技术也阻碍着裸眼3D技术的发展和普及。","经费：50万以上","北京","发布时间：2019-02-13");
        NeedsList.add(needs2);
        NeedsList.add(needs3);
        NeedsList.add(needs4);
        NeedsList.add(needs1);
        NeedsList.add(needs2);
        NeedsList.add(needs2);
        NeedsList.add(needs1);
    }

    private void initTechnologys() {
        Technology technology1 = new Technology(R.drawable.intelligent_door_lock,
                "智能门锁一体化家居安防系统","本智能门锁一体化家居安防系统，从系统上集成了智能锁，" +
                "智能门铃和智能摄像头，并通过一个主中央控制器来管理所有的智能模块。","中国","小试状态");
        TechnologyList.add(technology1);
        Technology technology2 = new Technology(R.drawable.temperature_monitor, "智能的可穿戴式婴幼儿睡眠及体温监护仪",
                "全球首款玩具功能的体温计，全球首款具有智能睡眠陪护的监护仪，安全、省心，同时也是玩具和室温检测器。",
                "美国","生试状态");
        Technology technology3 = new Technology(R.drawable.rewalk, "以色列Rewalk助步机器人",
                "世界上最先进的可穿戴式动力外骨骼机器人，最成熟的针对下肢残疾患者的解决方案，中国地区需求技术及商业合作伙伴进行中。",
                "以色列","生试状态");
        Technology technology4 = new Technology(R.drawable.intelligent_lamp_control, "智能灯控系统方案",
                "实现车间照明灯的光控智能节能控制。当光线暗到一定程度，车间里一部分灯自动打开，再暗到天黑时，灯全部打开，反之，光线渐亮时，灯分两次分别关断。",
                "以色列","生试状态");
        Technology technology5 = new Technology(R.drawable.aitreat, "【新加坡】Aitreat智能中医机器人理疗师",
                "世界上首款中医按摩机器人，革命性的专业服务解决方案，中国区商业及技术合作伙伴寻求中。",
                "新加坡","中试状态");
        TechnologyList.add(technology2);
        TechnologyList.add(technology3);
        TechnologyList.add(technology4);
        TechnologyList.add(technology5);
        TechnologyList.add(technology2);
        TechnologyList.add(technology2);
        TechnologyList.add(technology2);
    }

    private void initNews() {
        News news1 = new News(R.drawable.beauty,
                "一块化妆镜如何靠技术升级迎接这个“美颜时代”？",
                "导言：化妆镜都技术升级了，你呢？","2019-3-13 18:56:17");
        NewsList.add(news1);
        News news2 = new News(R.drawable.technology, "专家引荐精准匹配，新技术让企业扭亏为盈",
                "导言：通过迈科技自营技术经纪人团队的服务，江苏某环保股份有限公司提交到平台的需求得到解决，" +
                        "迈科技与技术方一直以来建立的良好合作关系为此次合作达成起到了重要作用。新项目的研发成功也将让企业有机会扭亏为盈。",
                "2012-3-12 19:45:56");
        News news3 = new News(R.drawable.cloud_computing, "才云科技：AI+云计算让IT管理成本降九成",
                "导言：技术让企业降本增效：才云科技通过“云计算”，帮助企业用十分之一的成本，实现50倍的提速。",
                "2019-3-12 10:45:56");
        News news4 = new News(R.drawable.alibaba, "阿里巴巴：在冲击更强悍技术的道路上狂奔",
                "导言：阿里巴巴作为一家世界级的公司，增加基础科学的投入、储备更强的技术力量既是应对未来发展的要求，也是社会责任感的体现。",
                "2019-3-11 13:15:36");
        News news5 = new News(R.drawable.itelligent_life, "常州波速：感知世界创造智能生活",
                "导言：传感器这一貌不起眼的器件，在智能化时代却举足轻重，其存在和发展让物体有了触觉、味觉，甚至嗅觉，在工业、健康养老、教育、医疗等领域正逐渐改变着我们的生活。",
                "2019-3-12 9:45:56");
        NewsList.add(news2);
        NewsList.add(news3);
        NewsList.add(news4);
        NewsList.add(news5);
        NewsList.add(news2);
        NewsList.add(news2);
        NewsList.add(news2);
    }
}
