listApp.service('listService', function ($q, $http) {
    /****** Daily *******/
    this.getListResult = function () {
        return $http.get(unitTypeUrl).then(function (response) {
                return response.data;
            },
            function (errResponse) {
                return $q.reject(errResponse);
            });
    }
});
