package com.hyx.goods.controller;

import com.hyx.common.entities.CommonResult;
import com.hyx.goods.service.SpGoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : xiaolang
 * @date ：Created in 2020/4/17 15:23
 */
@RestController
@RequestMapping("/sp-goods")
@Api(tags = "商品相关操作",value = "商品相关操作")
public class GoodsController {

    @Resource
    SpGoodsService spGoodsService;

    @ApiOperation(value = "获取商品信息列表", notes = "备注")
    @GetMapping(value = "/getGoodsList")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "current", dataType = "int", value = "当前页码"),
            @ApiImplicitParam(name = "size", dataType = "int", value = "获取的信息数")})
    public CommonResult getGoodsList(int current, int size) {
        return spGoodsService.getGoodsList(current, size);
    }

}
