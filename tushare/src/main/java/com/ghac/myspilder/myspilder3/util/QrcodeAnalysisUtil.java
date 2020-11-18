package com.ghac.myspilder.myspilder3.util;


import com.sasai.wallet.api.entity.service.MasterpassQRRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 商家二维码解析
 *
 * @author Z
 * @date 2019/3/21
 */
public class QrcodeAnalysisUtil {

    private static final Logger logger = LoggerFactory.getLogger(QrcodeAnalysisUtil.class);

    public static MasterpassQRRequest analys(String qrCode) {
        MasterpassQRRequest masterpassQRRequest = new MasterpassQRRequest();
        String qrcode = qrCode;
        byte[] qrdata = CrcUtil.strToByteArray(qrcode);
        byte[] crcData = CrcUtil.setParamCRC(qrdata);
        if (CrcUtil.isPassCRC(crcData, 2)) {
            logger.info("QrcodeAnalysisUtil|analys|验证通过, qrCode={}", qrCode);
        } else {
            logger.info("QrcodeAnalysisUtil|analys|验证失败, qrCode={}", qrCode);
        }
        while (true) {
            String tag = qrcode.substring(0, 2);
            String lstr = qrcode.substring(2, 4);

            int length = Integer.parseInt(lstr);
            if (length > qrcode.length() - 4) {
                logger.info("QrcodeAnalysisUtil|analys|解析出错, qrCode={}", qrCode);
                break;
            }
            String data = qrcode.substring(4, 4 + length);

            switch (tag) {
                case "04":
                    masterpassQRRequest.setMerchantId(data);
                    break;
                case "59":
                    masterpassQRRequest.setMerchantName(data);
                    break;
                default:
                    break;
            }
            //判断长度
            int paragraph = 2 + length + 2;
            //重置
            qrcode = qrcode.substring(paragraph, qrcode.length());
            if (qrcode.length() <= 0) {
                break;
            }
        }
        return masterpassQRRequest;
    }

}
