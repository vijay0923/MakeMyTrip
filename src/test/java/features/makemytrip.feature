Feature: Oneway and Roundtrip
  

      @OnewayTrip
      Scenario: Search One-way flight details
        Given I am on makemytrip
        When I perform one-way search
          | From | Delhi  |
          | To   | Bangalore |
        Then Search results should be display available flights


      @RoundTrip
      Scenario: Search round way flight details
        Given I am on makemytrip
        When I perform a roundtrip search
          | From | Mumbai |
          | To   | Delhi  |
        Then Search results should be display available flights
