package com.weidai.comet.dubbo;

import com.weidai.cdg.facade.channel.CRMCustomerFacade;
import com.weidai.cdg.facade.common.RpcResult;
import com.weidai.cdg.facade.dto.SalesmanPushDTO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CRMCustomerFacadeTest extends BaseTest {

    @Autowired
    private CRMCustomerFacade crmCustomerFacade;

    @Test
    public void testDesignatedSalesmanPush(){
        SalesmanPushDTO salesmanPushDTO = new SalesmanPushDTO();
        salesmanPushDTO.setUsername("夏凡");
        salesmanPushDTO.setUserMobile("15688416075");
        salesmanPushDTO.setProductType("车抵贷");
        salesmanPushDTO.setCid(6);
        salesmanPushDTO.setStationName("杭州萧山");
        salesmanPushDTO.setSalesmanUid(79725);
        salesmanPushDTO.setSalesmanName("郑大尧");
        salesmanPushDTO.setSalesLoginName("业务员萧山_19");
        salesmanPushDTO.setSalesTel("18244191234");
        salesmanPushDTO.setCityId(1002);
        salesmanPushDTO.setRemarks("呼叫中心");
        RpcResult<String> invokeResult = crmCustomerFacade.designatedSalesmanPush(salesmanPushDTO);
        System.out.println(invokeResult);
    }

}
