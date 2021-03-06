package io.swagger.api;

import java.util.Map;
import io.swagger.model.Order;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/store")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2018-08-02T12:42:18.406-05:00[America/Bogota]")
public interface StoreApi {

    @DELETE
    @Path("/order/{order_id}")
    @Operation(summary = "Delete purchase order by ID", description = "For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors", tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Order not found") })
    void deleteOrder( @PathParam("order_id")

 @Parameter(description = "ID of the order that needs to be deleted") String orderId
);
    @GET
    @Path("/inventory")
    @Operation(summary = "Returns pet inventories by status", description = "Returns a map of status codes to quantities", tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Map.class)))) })
    Map<String, Integer> getInventory();
    @GET
    @Path("/order/{order_id}")
    @Operation(summary = "Find purchase order by ID", description = "For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions", tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Order.class))),
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Order not found") })
    Order getOrderById( @DecimalMin("1") @DecimalMax("5") @PathParam("order_id")

 @Parameter(description = "ID of pet that needs to be fetched") Integer orderId
);
    @POST
    @Path("/order")
    @Operation(summary = "Place an order for a pet", description = "", tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Order.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Order") })
    Order placeOrder(@Valid Order body);}
