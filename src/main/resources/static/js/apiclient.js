const Url = 'http://localhost:8080/';
apiclient = (function () {
    var f=[]
    return {
        getAuthor: function (name, callback) {
                $.get(Url+name,function(data){
                    f=data;
                });
                return callback(f)
        },
    };
})();