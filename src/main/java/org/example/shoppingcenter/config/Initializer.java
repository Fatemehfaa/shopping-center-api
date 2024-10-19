package org.example.shoppingcenter.config;

import org.example.shoppingcenter.category.CategoryEntity;
import org.example.shoppingcenter.category.CategoryRepository;
import org.example.shoppingcenter.customer.CustomerEntity;
import org.example.shoppingcenter.customer.CustomerRepository;
import org.example.shoppingcenter.elevator.ElevatorEntity;
import org.example.shoppingcenter.elevator.ElevatorRepository;
import org.example.shoppingcenter.floor.FloorEntity;
import org.example.shoppingcenter.floor.FloorRepository;
import org.example.shoppingcenter.parking.ParkingEntity;
import org.example.shoppingcenter.parking.ParkingRepository;
import org.example.shoppingcenter.parking.ParkingType;
import org.example.shoppingcenter.product.ProductEntity;
import org.example.shoppingcenter.product.ProductRepository;
import org.example.shoppingcenter.seller.SellerEntity;
import org.example.shoppingcenter.seller.SellerRepository;
import org.example.shoppingcenter.shop.ShopEntity;
import org.example.shoppingcenter.shop.ShopRepository;
import org.example.shoppingcenter.shop.ShopType;
import org.example.shoppingcenter.shoppingcenter.ShoppingCenterEntity;
import org.example.shoppingcenter.shoppingcenter.ShoppingCenterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Initializer {

    @Bean
    CommandLineRunner runner(CategoryRepository categoryRepository, ProductRepository productRepository, FloorRepository floorRepository,
                             ShopRepository shopRepository, SellerRepository sellerRepository, CustomerRepository customerRepository, ShoppingCenterRepository shoppingCenterRepository,
                             ElevatorRepository elevatorRepository, ParkingRepository parkingRepository) {
        return args -> {

            FloorEntity floor = new FloorEntity();
            floor.setFloorNumber(11L);
            floorRepository.save(floor);


            ShoppingCenterEntity shoppingCenter = ShoppingCenterEntity.builder()
                    .name("opal")
                    .location("gharb")
                    .build();
            shoppingCenterRepository.save(shoppingCenter);


            CustomerEntity customer = CustomerEntity.builder()
                    .name("customer")
                    .build();
            customerRepository.save(customer);


            ShopEntity shop1 = ShopEntity.builder()
                    .name("kidsShop")
                    .type(ShopType.STORE)
                    .floor(floor)
                    .shoppingCenter(shoppingCenter)
                    .build();

            ShopEntity shop2 = ShopEntity.builder()
                    .name("hyperStar")
                    .type(ShopType.HYPER)
                    .floor(floor)
                    .shoppingCenter(shoppingCenter)
                    .build();

            shopRepository.saveAll(List.of(shop1, shop2));


            shoppingCenter.setShops(List.of(shop1, shop2));
            shoppingCenterRepository.save(shoppingCenter);


            SellerEntity seller1 = SellerEntity.builder()
                    .name("Sara")
                    .shop(shop1)
                    .build();

            SellerEntity seller2 = SellerEntity.builder()
                    .name("Tom")
                    .shop(shop2)
                    .build();


            SellerEntity seller3 = SellerEntity.builder()
                    .name("John")
                    .shop(shop2)
                    .build();

            SellerEntity seller4 = SellerEntity.builder()
                    .name("Mike")
                    .shop(shop2)
                    .build();

            sellerRepository.saveAll(List.of(seller1, seller2, seller3, seller4));


            CategoryEntity category = CategoryEntity.builder()
                    .name("kids")
                    .build();
            categoryRepository.save(category);


            ProductEntity product1 = ProductEntity.builder()
                    .title("toy")
                    .price(9.25)
                    .description("for playing kids")
                    .shop(shop2)
                    .category(category)
                    .build();

            ProductEntity product2 = ProductEntity.builder()
                    .title("cloths")
                    .price(220.0)
                    .description("for winter")
                    .shop(shop1)
                    .category(category)
                    .build();
            productRepository.saveAll(List.of(product1, product2));


            ElevatorEntity elevator = ElevatorEntity.builder()
                    .floor(floor)
                    .build();
            elevatorRepository.save(elevator);


            ParkingEntity parking = ParkingEntity.builder()
                    .numberParking(-1L)
                    .type(ParkingType.WEST.name())
                    .build();
            parkingRepository.save(parking);

//            ShopEntity shop = shopRepository.findById(shop1.getId()).get();
//            shop.getSellers().forEach(sellerEntity -> System.out.println(sellerEntity.getName()));

        };

    }
}
