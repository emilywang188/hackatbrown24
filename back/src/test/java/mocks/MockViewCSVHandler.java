package mocks;

import spark.Request;
import spark.Response;
import spark.Route;

public class MockViewCSVHandler implements Route {
  @Override
  public Object handle(Request request, Response response){
    return "success";
  }

}
