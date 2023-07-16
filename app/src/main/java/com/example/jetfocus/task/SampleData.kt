package com.example.jetfocus.task

import com.example.jetfocus.R

data class User(val imageId: Int, val name: String, val job: String, val intro: String)

val users = listOf(
    User(R.drawable.avatar_1, "资涵荔", "打桩机操作员", "热情的电视爱好者。 自由网络专家。 骄傲的作家。 时髦友好的推特狂热分子。"),
    User(R.drawable.avatar_2, "Malinda Laplace", "Controlled Machine Tool Programmer", "Tv junkie. Award-winning pop culture maven. Passionate beer scholar. Total bacon evangelist."),
    User(R.drawable.avatar_3, "Leeann Gwirtz", "Transportation and Material Moving Occupation", "专业咖啡爱好者。 经过认证的培根倡导者。 游戏玩家。 流行文化学者。 邪恶的读者。"),
    User(R.drawable.avatar_4, "伊森艺", "电气工程师", "想成为思想家。 网络忍者。 骄傲的咖啡学者。 互联网爱好者。 邪恶的内向者。"),
    User(R.drawable.avatar_5, "闵婷", "宝石和钻石工人", "认证思想家。 旅行爱好者。 极端电视专家。 网络迷。 虔诚的网络迷。 自由咖啡从业者。"),
    User(R.drawable.avatar_6, "宁绪", "游戏主播", "社交媒体粉丝。 麻烦制造者。 电视专家。 问题解决。 音乐爱好者。 微妙迷人的美食爱好者。"),
    User(R.drawable.avatar_7, "骆魏晖", "工资和计时文员", "沟通者。 铁杆作家。 认证啤酒专家。 一般流行文化爱好者。 网络专家。"),
    User(R.drawable.avatar_8, "李群", "小生意主", "创造者。 热情的分析师。 认证玩家。 想当学生。 音乐专家。 推特大师。 终生作家。 友好的组织者。"),
    User(R.drawable.avatar_9, "郑芸瑞", "大学教育行政人员", "僵尸专家。 总读者。 典型的酒精爱好者。 内向。 邪恶的网络狂热分子。 时髦友好的旅行爱好者。"),
    User(R.drawable.avatar_10, "邝广彬", "生物燃料加工技术员", "问题解决。 互联网布道者。 忠实的社交媒体狂热者。 热情的推特极客。"),
)