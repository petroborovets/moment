(function() {
    'use strict';

    angular
        .module('momentApp')
        .controller('PhotoController', PhotoController);

    PhotoController.$inject = ['$scope', '$state', 'Photo'];

    function PhotoController ($scope, $state, Photo) {
        var vm = this;

        vm.photos = [];

        loadAll();

        function loadAll() {
            Photo.query(function(result) {
                vm.photos = result;
                vm.searchQuery = null;
            });
        }
    }
})();
