var api = apiclient;
var Run = (function() {
  var nameAuthor;


  var cambiarNombre = function(author) {
    nameAuthor = author;
  };

  var actualizar = function(author) {
    cambiarNombre(author);
    $("#authorname").text(author);
    api.getBlueprintsByAuthor(author, generatetable);
  };

  var pintarBlue = function(author, name) {
    api.getBlueprintsByNameAndAuthor(author, name, generateCanvas);
  };

  var mapPoints = function(blueprints) {
    return blueprints.map(function(blueprint) {
      return { name: blueprint.name, points: blueprint.points.length };
    });
  };


  var generatetable = function(blueprints) {
    blueprints = mapPoints(blueprints);
    $("#tablas").empty(); 
    blueprints.map(function(blueprint) {
      $("#tablas").append(
        "<tr> <td>" +
          blueprint.name +
          "</td> <td>" +
          blueprint.email 
      );
    });
  };


  return {
    actualizar: actualizar,
    pintarBlue: pintarBlue,
    init: init
  };
})();
