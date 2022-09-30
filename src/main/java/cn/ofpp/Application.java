package cn.ofpp;

import cn.ofpp.core.BoyFriend;
import cn.ofpp.core.GirlFriend;
import cn.ofpp.core.MessageFactory;
import cn.ofpp.core.Wx;

public class Application {

    /**
     * <li>创建配置</li>
     * <li>创建几个 男/女 朋友</li>
     * <li>发消息</li>
     */
    public static void main(String[] args) {
        // load and init
        Bootstrap.init();

        // -----------------  以下为演示数据  ------------------------

        GirlFriend girlFriend = new GirlFriend("张紫阳",
                "河南省", "郑州市", "2003-10-23", "2022-08-04", "oD1gX6ABTlHOX5lHuYyplfIUYk-o");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(girlFriend));

        BoyFriend boyFriend = new BoyFriend("李明渊",
                "河南省", "郑州市", "2002-08-22", "2022-08-04", "oD1gX6PI0A_95cEWll49yCP4EaRQ");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(boyFriend));
        
        GirlFriend girlFriend1 = new GirlFriend("刘珂",
                "河南省", "商丘市", "2001-11-22", "2018-9-1", "oD1gX6Gts9_1-xxWNMkFfSa-15w0");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(girlFriend1));
        
        GirlFriend girlFriend1 = new GirlFriend("冯怡柯",
                "河南省", "商丘市", "2022-09-27", "2022-9-27", "oD1gX6EP7vd1b0X_F1KZSTV_qtT4");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(girlFriend1));
    }

}
