package com.ecommerce.order.dto;


public record OrderRequest (Long id,Long price,String skuCode, Integer quantity)
{
}
